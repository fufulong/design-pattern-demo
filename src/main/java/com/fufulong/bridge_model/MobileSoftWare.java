package com.fufulong.bridge_model;

/**
 * 手机软件抽象类
 */
public abstract class MobileSoftWare {
    protected String name;
    protected void setName(String name ){
        this.name = name;
    }
    protected String getName(){
        return this.name;
    }
    public MobileSoftWare(String name){
        this.name = name;
    }
    public abstract void run();
}
