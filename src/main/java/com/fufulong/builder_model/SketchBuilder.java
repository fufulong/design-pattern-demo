package com.fufulong.builder_model;

/**
 * 素描创建者
 */
public class SketchBuilder extends PaitingBuilder {
    //具体的构造者记得构造方法里面初始化产品,或者在抽象的paitingBuilder中初始化
    public SketchBuilder(){
        super.paiting = new Paiting();
    }
    @Override
    protected void paintOuline() {
        System.out.println("按照实际比例和特征画出素描的轮廓");
        super.paiting.setOutline("素描按照实际画出的轮廓");
    }

    @Override
    protected void paintLineDetails() {
        System.out.println("仔细修改完善素描的线条细节");
        super.paiting.setLineDetails("素描修改后的线条细节");

    }

    @Override
    protected void paintColor() {
        System.out.println("加上黑白灰的上色风格");
        super.paiting.setColorStyle("素描黑白灰的上色风格");
    }

}
