package com.fufulong.adpter_model;

/**
 * 适配器模式的测试客户端
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.normalRequest();
        System.out.println("--------------------------");
    }
}
