package com.fufulong.visitor_model;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * 主要是保存,增加,减少所有能够被访问的元素
 * 还需要有一个方法,让所有的元素依次被一个访问者访问
 */
public class ObjectStructrue {
    private List<Element> elementList = new ArrayList<>();
    //增加介绍可以被访问的元素对象的方法
    public void addElement(Element element){
        this.elementList.add(element);
    }

    public void removeElement(Element element){
        this.elementList.remove(element);
    }

    /**
     * 让指定的访问者依次访问所有的元素
     * @param visitor
     */
    public void accept(Visitor visitor){
        elementList.stream().forEach(element -> {
            element.accept(visitor);
        });
    }
}
