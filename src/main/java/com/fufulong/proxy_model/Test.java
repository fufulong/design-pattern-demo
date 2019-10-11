package com.fufulong.proxy_model;

public class Test {

    public static void main(String[] args) {
        Schoolgirl schoolgirl = new Schoolgirl();
        schoolgirl.setName("李娇娇");
        Proxy proxy = new Proxy("戴立", schoolgirl);
        proxy.sendFlower();
        proxy.sendChocolate();
    }
}
