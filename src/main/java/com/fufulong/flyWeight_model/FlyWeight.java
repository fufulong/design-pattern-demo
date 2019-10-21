package com.fufulong.flyWeight_model;

import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

/**
 * 抽象享元对象
 */
public abstract class FlyWeight {

    //抽象的享元对象,根据非享元对象的操作的方法
    protected abstract void operation(Action action);
}
