package com.fufulong.visitor_model;

import lombok.Data;

/**
 * 抽象元素类
 */
@Data
public abstract class Element {
    //元素名称
    protected  String name;
    //抽象的接受访问者对象的方法
    protected abstract void accept(Visitor visitor);

}
