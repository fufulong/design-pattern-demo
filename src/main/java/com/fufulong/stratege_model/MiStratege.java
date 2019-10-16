package com.fufulong.stratege_model;

import lombok.Data;

import java.util.MissingFormatArgumentException;

/**
 * 求 数字A的数字B次幂运算
 */
public class MiStratege extends Stratege {
    public MiStratege(Integer numberA, Integer numberB) {
      this.numberB = numberB;
      this.numberA = numberA;
    }
    public MiStratege(){}

    @Override
    public void showResult() {
        double result = Math.pow(Double.valueOf(numberA), Double.valueOf(numberB));
        System.out.println("幂运算:" + numberA + "的" + numberB +"次幂的值是" + result);
    }
}
