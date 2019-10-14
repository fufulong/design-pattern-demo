package com.fufulong.prototype_model;

/**
 * 原型模式测试客户端程序
 */
public class Client {
    public static void main(String[] args) {
        Resume a = new Resume("张三");
        a.setPersonalInfo("张三", "男");
        a.setWorkExperience("2016-2019", "大大公司");
     //克隆出2个
        Resume b = a.clone();
        b.setWorkExperience("2017-2019","小小公司");
        Resume c = a.clone();
        c.setPersonalInfo("李四","男");
        c.setWorkExperience("2015-2018","中中公司");
        //打印结果
        a.display();
        b.display();
        c.display();
    }
}
