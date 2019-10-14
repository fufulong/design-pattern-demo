package com.fufulong.builder_model;

public abstract class PaitingBuilder {
    //依赖作为产品的画画类
    protected Paiting paiting ;
    //抽象3个创建步骤
    protected abstract void paintOuline();
    protected abstract void paintLineDetails();
    protected abstract void paintColor();
    //返回创建的结果
    protected  Paiting getPaiting(){
        return this.paiting;
    }
}
