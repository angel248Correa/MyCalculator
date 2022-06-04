package com.actecnologyl.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.e.message_box.R;

import java.sql.ResultSet;



public class GridActivity extends AppCompatActivity {
    Button zero, digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, clear, dot, div, add, sub, multi, res;
    EditText out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


        final Calculation calculation = new Calculation();

        clear = findViewById(R.id.clear);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        zero = findViewById(R.id.zero);
        digit1 = findViewById(R.id.digit1);
        digit2 = findViewById(R.id.digit2);
        digit3 = findViewById(R.id.digit3);
        digit4 = findViewById(R.id.digit4);
        digit5 = findViewById(R.id.digit5);
        digit6 = findViewById(R.id.digit6);
        digit7 = findViewById(R.id.digit7);
        digit8 = findViewById(R.id.digit8);
        digit9 = findViewById(R.id.digit9);
        res = findViewById(R.id.res);
        out = findViewById(R.id.out);
        dot = findViewById(R.id.dot);

        //clickevent
        digit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "1");
                    return;
                } else {
                    out.setText("1");
                    calculation.Com = false;
                }
            }
        });
        digit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "2");
                    return;
                } else {
                    out.setText("2");
                    calculation.Com = false;
                }
            }
        });

        digit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {

                    out.setText(out.getText() + "3");
                    return;
                } else {
                    out.setText("3");
                    calculation.Com = false;
                }
            }
        });
        digit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {

                    out.setText(out.getText() + "4");
                    return;
                } else {
                    out.setText("4");
                    calculation.Com = false;
                }
            }
        });
        digit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "5");
                    return;
                } else {
                    out.setText("5");
                    calculation.Com = false;
                }
            }
        });
        digit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "6");
                    return;
                } else {
                    out.setText("6");
                    calculation.Com = false;
                }
            }
        });
        digit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "7");
                    return;
                } else {
                    out.setText("7");
                    calculation.Com = false;
                }
            }
        });
        digit8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "8");
                    return;
                } else {
                    out.setText("8");
                    calculation.Com = false;
                }
            }
        });
        digit9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "9");
                    return;
                } else {
                    out.setText("9");
                    calculation.Com = false;
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + "0");
                    return;
                } else {
                    out.setText("0");
                    calculation.Com = false;
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.Com != true) {
                    out.setText(out.getText() + ".");
                    return;
                } else {
                    out.setText("0.");
                    calculation.Com = false;
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText("");
                calculation.callAdd = false;
                calculation.callMulti = false;
                calculation.callDiv = false;
                calculation.callSub = false;
                calculation.Com = false;
            }
        });
        //add button click
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.callAdd != true) {
                    calculation.inital1 = Float.parseFloat(out.getText().toString());
                    calculation.callAdd = true;
                    out.setText("");

                    return;
                }
                else
                {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    calculation.inital1=(calculation.add());

                    out.setText("");
                    return;
                }
            }
        });
        //subtract button click
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.callSub != true) {
                    calculation.inital1 = Float.parseFloat(out.getText().toString());
                    calculation.callSub = true;
                    out.setText("");

                    return;
                }
                else
                {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    calculation.inital1=(calculation.sub());

                    out.setText("");
                    return;
                }
            }
        });
        //multiply button click
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.callMulti != true) {
                    calculation.inital1 = Float.parseFloat(out.getText().toString());
                    calculation.callMulti = true;
                    out.setText("");

                    return;
                }
                else
                {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    calculation.inital1=(calculation.multipy());

                    out.setText("");
                    return;
                }
            }
        });
        //division button click
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.callDiv != true) {
                    calculation.inital1 = Float.parseFloat(out.getText().toString());
                    calculation.callDiv = true;
                    out.setText("");

                    return;
                }
                else
                {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    calculation.inital1=(calculation.div());

                    out.setText("");
                    return;
                }
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.callAdd == true) {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    String res = Float.toString(calculation.add());
                    out.setText(res);
                    calculation.callAdd = false;
                    calculation.Com = true;
                    return;
                }
                if (calculation.callSub == true) {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    String res = Float.toString(calculation.sub());
                    out.setText(res);
                    calculation.callSub = false;
                    calculation.Com = true;
                    return;
                }
                if (calculation.callMulti == true) {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    String res = Float.toString(calculation.multipy());
                    out.setText(res);
                    calculation.callMulti = false;
                    calculation.Com = true;
                    return;
                }
                if (calculation.callDiv == true) {
                    calculation.inital2 = Float.parseFloat(out.getText().toString());
                    String res = Float.toString(calculation.div());
                    out.setText(res);
                    calculation.callDiv = false;
                    calculation.Com = true;
                    return;
                }

            }
        });

    }
}