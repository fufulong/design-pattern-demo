package com.fufulong.visitor_model;

public class ElementB extends Element{
    /**
     * 具体元素A的接受访问者的方法,一般就是调用访问者的visit()方法
     * @param visitor
     */
    @Override
    protected void accept(Visitor visitor) {
        visitor.visitElementB(this);
        System.out.println(visitor.getName() +" 访问了" + this.getName());
    }
}
