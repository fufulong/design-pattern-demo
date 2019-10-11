package com.fufulong.Observer_model;

public class Test {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        secretary.setName("李秘书");
        StackObserver observer1 = new StackObserver("张三", secretary);
        StackObserver observer2 = new StackObserver("李四", secretary);
        secretary.addObserver(observer1);
        secretary.addObserver(observer2);
        //老板回来了,发出信息
        secretary.setAction("老板回来了");
        secretary.tell();
    }
}
