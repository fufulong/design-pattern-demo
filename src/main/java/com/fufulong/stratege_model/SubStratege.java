package com.fufulong.stratege_model;

/**
 * 减法运算
 */
public class SubStratege extends Stratege{
    public SubStratege(Integer numberA, Integer numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public SubStratege(){}

    @Override
    public void showResult() {
        int result = this.numberA - this.numberB;
        System.out.println("减法运算: " + numberA + " -" + numberB + " = " + result);
    }
}
