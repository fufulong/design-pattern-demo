package com.fufulong.flyWeight_model;

/**
 * 具体的享元对象,只有两种 男人和女人
 * 女人类
 *
 */
public class Women extends FlyWeight {

    @Override
    protected void operation(Action action) {
        String actionName = action.getName();
        System.out.println("女人在" + actionName);
    }
}
