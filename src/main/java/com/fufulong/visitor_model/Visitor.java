package com.fufulong.visitor_model;

import lombok.Data;

/**
 * 抽象访问者
 */
@Data
public abstract class Visitor {
    protected String name ;
    /**
     * 不同的访问者对同一个元素有不同的处理方式,
     * 具体访问者需要有对每一个元素的访问行为方法
     * @param elementA
     */
    protected abstract void visitElementA(ElementA elementA);
    protected abstract void visitElementB(ElementB elementB);
}
