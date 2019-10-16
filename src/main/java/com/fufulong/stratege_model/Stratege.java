package com.fufulong.stratege_model;

import lombok.Data;

/**
 * 表示策略的抽象类,这个是2个数运算的策略抽象类
 */
@Data
public abstract class Stratege {
    protected Integer numberA;
    protected Integer numberB;

    //表示得到显示两个数运算结果的方法
    public abstract void showResult();
}
