package com.fufulong.visitor_model;

/**
 * 测试客户端
 */
public class Client {
    public static void main(String[] args) {
        //1.准备元素和访问者
        Element elementA = new ElementA();
        elementA.setName("元素A");
        Element elementB = new ElementB();
        elementB.setName("元素B");
        Visitor visitor1 = new Visitor1();
        visitor1.setName("访问者1");
        Visitor visitor2 = new Visitor2();
        visitor2.setName("访问者2");
        //2.构架ObjectStructure
        ObjectStructrue objectStructrue = new ObjectStructrue();
        objectStructrue.addElement(elementA);
        objectStructrue.addElement(elementB);
        //3.ObjectStructrue 执行accept,是有visitor1或者visitor2
        objectStructrue.accept(visitor1);
        objectStructrue.accept(visitor2);
    }
}
