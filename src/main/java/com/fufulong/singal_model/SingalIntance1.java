package com.fufulong.singal_model;

/**
 * 第一种单例模式构建方法,不考虑多线程安全,懒汉式
 */
public class SingalIntance1 {

    private static SingalIntance1 instance;
    private SingalIntance1(){};

    public static SingalIntance1 getInstance(){
        if (instance == null){
            instance = new SingalIntance1();
        }
        return instance;
    }
}
