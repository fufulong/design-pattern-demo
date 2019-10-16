package com.fufulong.stratege_model;

/**
 * 加法策略
 */
public class AddStratege extends Stratege{
    public AddStratege(Integer numberA, Integer numberB) {
        this.numberB = numberB;
        this.numberA = numberA;
    }
    public AddStratege(){}

    @Override
    public void showResult() {
        Integer result = numberA + numberB ;
        System.out.println("加法运算: " + numberA + " + " + numberB + " = " + result);
    }
}
