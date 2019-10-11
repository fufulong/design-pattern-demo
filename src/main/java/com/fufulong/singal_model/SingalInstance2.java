package com.fufulong.singal_model;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 单例模式构建方法,双重锁定懒汉式方法
 */
public class SingalInstance2 {
    private static SingalInstance2 instance;
    private static Object lock = new Object();

    private SingalInstance2(){}
    private static SingalInstance2 getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null){
                    instance = new SingalInstance2();
                }
            }
        }
        return instance;
    }
}
