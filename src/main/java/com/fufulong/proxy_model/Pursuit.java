package com.fufulong.proxy_model;

import lombok.Data;

/**
 * 追求者
 */
@Data
public class Pursuit implements Subject {
    private String name;
    private Schoolgirl schoolgirl;
    public Pursuit(String name, Schoolgirl schoolgirl){
        this.name = name ;
        this.schoolgirl = schoolgirl;
    }

    @Override
    public void sendFlower(){
        System.out.println("真正追求者" + name  + "想给学校女孩" + this.schoolgirl.getName() +"送花");
    }
    @Override
    public void sendChocolate(){
        System.out.println("真正追求者" + name + "想给学校女孩" + getSchoolgirl().getName() + "送巧克力");
    }
}
