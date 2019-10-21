package com.fufulong.visitor_model;

public class Visitor2 extends Visitor {
    @Override
    protected void visitElementA(ElementA elementA) {
        System.out.println(this.getName() + "正在处理" + elementA.getName());
    }

    @Override
    protected void visitElementB(ElementB elementB) {
        System.out.println(this.getName() + "正在处理" + elementB.getName());
    }
}
