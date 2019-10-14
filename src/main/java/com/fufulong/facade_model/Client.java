package com.fufulong.facade_model;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method1();
        facade.method2();
    }
}
