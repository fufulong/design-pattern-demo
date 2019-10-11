package com.fufulong.singal_model;

/**
 * 单例模式;私有静态内部内实现方式
 */
public class SingalInstance3 {

    private SingalInstance3(){}

    private static class SingalInstance3Factory{
        private static SingalInstance3 instance = new SingalInstance3();
    }

    public SingalInstance3 getInstance(){
        return SingalInstance3Factory.instance;
    }
}
