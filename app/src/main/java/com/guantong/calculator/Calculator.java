package com.guantong.calculator;

/**
 * Created by Alien on 3/31/2015.
 */
public class Calculator {
    int input1, input2;

    public Calculator(){
        input1 = 0;
        input2 = 0;
    }

    public Calculator(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput1() {
        return input1;
    }

    public int getInput2() {
        return input2;
    }


}
