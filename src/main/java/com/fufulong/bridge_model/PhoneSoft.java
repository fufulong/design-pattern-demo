package com.fufulong.bridge_model;

/**
 * 打电话程序
 */
public class PhoneSoft extends MobileSoftWare {
    public PhoneSoft(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "程序执行");
    }
}
