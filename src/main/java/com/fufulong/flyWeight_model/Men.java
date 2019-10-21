package com.fufulong.flyWeight_model;

public class Men extends FlyWeight{

    @Override
    protected void operation(Action action) {
       String actionName = action.getName();
        System.out.println("男人在" + actionName);
    }
}
