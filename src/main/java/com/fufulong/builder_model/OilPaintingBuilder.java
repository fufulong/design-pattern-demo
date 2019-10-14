package com.fufulong.builder_model;

/**
 *油画的创建者
 */
public class OilPaintingBuilder extends PaitingBuilder {
    //具体的构造这记得初始化产品
    public OilPaintingBuilder(){
        super.paiting = new Paiting();
    }
    @Override
    protected void paintOuline() {
        System.out.println("画出油画的简单的轮廓");
        super.paiting.setOutline("简单的轮廓");
    }

    @Override
    protected void paintLineDetails() {
        System.out.println("勾勒出几笔油画的写意的线条细节");
        super.paiting.setLineDetails("简单写意的线条细节");
    }

    @Override
    protected void paintColor() {
        System.out.println("构思写意油画的上色");
        super.paiting.setColorStyle("写意的上色方式");
    }

}
