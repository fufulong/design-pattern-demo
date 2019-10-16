package com.fufulong.decorator_model;

import lombok.Data;

/**
 * 具体的人,这里是程序员,可能还可以是别的,我没写
 */
@Data
public class Programmer implements Person{
    private String name;
    //程序员一般的情况下都穿着简单
    @Override
    public void show() {
        System.out.print("打扮的程序员" + this.getName());
    }
}
