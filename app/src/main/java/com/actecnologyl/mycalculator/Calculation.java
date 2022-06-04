package com.actecnologyl.mycalculator;

public class Calculation {

    float inital1,inital2,result;
    boolean callAdd,callSub,callMulti,callDiv,Com=false;
    // addition
    public float add()
    {
        this.result = inital1+ inital2;
        return result;
    }
    // subtraction
    public float sub()
    {
        return this.result = inital1-inital2;

    }
    // multiplication
    public float multipy()
    {
        return  this.result = inital1* inital2;
    }

    // division
    public float div()
    {
        return this.result = inital1/inital2;

    }
}
