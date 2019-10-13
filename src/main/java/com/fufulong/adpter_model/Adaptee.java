package com.fufulong.adpter_model;

/**
 * 需要被适配器适配的类,里面有和Target功能差不多的方法
 */
public class Adaptee {
    public void specialRequest(){
        System.out.println("Adaptee 执行特殊请求");
    }
}
