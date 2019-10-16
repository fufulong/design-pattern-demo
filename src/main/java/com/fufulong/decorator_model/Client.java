package com.fufulong.decorator_model;

public class Client {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        //第一种打扮,穿T恤,再大领带,最后穿西装
        Programmer xiaocai = new Programmer();
        xiaocai.setName("小菜");
        Tshirt tshirt = new Tshirt();
        tshirt.setColor("白色");
        Tie tie = new Tie();
        BusinessSuit businessSuit = new BusinessSuit();
        //不同的封装顺序代表不同的打扮方式
        businessSuit.decorator(xiaocai);
        tie.decorator(businessSuit);
        tshirt.decorator(tie);
        tshirt.show();
    }
}
