package com.fufulong.Observer_model;

/**
 * 使用观察者模式之后的客户端程序
 */
public class Test2 {
    public static void main(String[] args) {
        //1.创建具体的观察者--秘书对象
        Secretary secretary = new Secretary();
        secretary.setName("李秘书");
        //2.创建几个不同类型的观察者并一起作为秘书的通知对象
        NbaObserver nbaObserver = new NbaObserver("张三", secretary);
        StackObserver stackObserver = new StackObserver("王二",secretary);
        secretary.addObserver(nbaObserver);
        secretary.addObserver(stackObserver);
        //3.秘书当看到老板回来之后,马上有所行动,并通知绑定的观察们
        System.out.println("当老板回来的的时候------------------------");
        secretary.setAction("老板回来了");
        secretary.tell();
    }
}
