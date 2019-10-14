package com.fufulong.builder_model;

/**
 * 测试建造者模式的客户端程序
 */
public class Client {
    public static void main(String[] args) {
        //画画指挥者先指挥油画构建者创建油画
        OilPaintingBuilder oilPaintingBuilder = new OilPaintingBuilder();
        PaiterDerector derector = new PaiterDerector(oilPaintingBuilder);
        derector.paiting();
        //得到创建出的油画
        Paiting oilPainting = oilPaintingBuilder.getPaiting();
        //展示这幅油画
        oilPainting.show();

        System.out.println("----------------------------------------------------------------------------");

        //画画指挥者再指挥素描创建者创建素描
        SketchBuilder sketchBuilder = new SketchBuilder();
        derector = new PaiterDerector(sketchBuilder);
        derector.paiting();
        // 得到创建出来的素描
        Paiting sketch = sketchBuilder.getPaiting();
        //展示画出的素描
        sketch.show();

    }
}
