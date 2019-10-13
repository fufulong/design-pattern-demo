package com.fufulong.adpter_model;

/**
 * target和Adaptee 之间的适配器
 */
public class Adapter implements Target {
    //适配器需要关联 Adaptee,并需要是私有的
    private Adaptee adaptee = new Adaptee();
    @Override
    public void normalRequest() {
        System.out.println("这里是转换器的方法,下面调用Adaptee的类似方法");
        adaptee.specialRequest();
    }
}
