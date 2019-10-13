package com.fufulong.Observer_model;
//通知者接口
public interface Subject {
    //定义增加通知者的方法,依赖的是抽象的通知者
    void addObserver(Observer observer);
    //定义减少通知者的方法,依赖的是抽象的通知者
    void subObserver(Observer observer);
    //告知通知者的方法
    void tell();
    //得到通知的消息的抽象方法
    public String getAction();
}
