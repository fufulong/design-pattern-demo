package com.fufulong.composite_model;

/**
 * 所有枝叶的共有 抽象类接口,需要定义添加/减少 枝叶对象的方法,还有枝叶其他都要实现的行为
 */
public abstract class Component {
    public abstract void addComponent(Component component);
    public abstract void subComponent(Component component);
    //递归展示层级关系
    public abstract void display();
    //还要能设置层级关系
    public abstract void setLevel(Integer level);

}
