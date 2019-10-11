package com.fufulong.Observer_model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 秘书类,通知者
 */
@Data
public class Secretary implements Subject{
    //通知者发出的信息
    private String action;
    private String name;
    //绑定得观察者们
    private List<Observer> observers = new ArrayList<>();
    //增加观察者和减少观察者的方法
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void subObserver(Observer observer){
        observers.remove(observer);
    }
    //通知方法
    @Override
    public void tell(){
       observers.stream().forEach(item -> item.update());
    }
}
