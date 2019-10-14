package com.fufulong.builder_model;

/**
 * 画画组织者,需要依赖具体的创建者,然后有一个方法,制定产品组装各个部分的顺序与逻辑
 */
public class PaiterDerector {
    //必须私有化 创建者属性,并提供共有的参数是创建者的构造方法
    private PaitingBuilder builder;

    public PaiterDerector(PaitingBuilder builder){
        this.builder = builder;
    }
    //画画过程
    public void paiting(){
        builder.paintOuline();
        builder.paintLineDetails();
        builder.paintColor();
    }
}
