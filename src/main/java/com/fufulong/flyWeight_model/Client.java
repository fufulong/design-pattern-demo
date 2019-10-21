package com.fufulong.flyWeight_model;

import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

/**
 * 测试客户端
 */
public class Client {
    public static void main(String[] args) {

        //1.创建几个事件
        Action action1 = new Action("化妆");
        Action action2 = new Action("做家务");
        Action action3 = new Action("写字");
        //2.创建工厂
        FlyFactory factory = new FlyFactory();
        FlyWeight men = factory.getFlyweight("男人");
        FlyWeight women = factory.getFlyweight("女人");
        men.operation(action1);
        men.operation(action2);
        men.operation(action3);
        women.operation(action1);
        women.operation(action2);
        women.operation(action3);

    }
}
