package com.fufulong.proxy_model;

import lombok.Data;

/**
 * 代理类
 */
@Data
public class Proxy implements Subject{
    private Schoolgirl schoolgirl;
    private String name ;
    //新增关联Pursuit
    private Pursuit pursuit;
    //私有化pursuit的set和get方法,防止外界通过Proxy能直接得到被代理对象Proxy
    private Pursuit getPursuit(){
        return this.pursuit;
    }
    private void setPursuit(Pursuit pursuit){
        this.pursuit = pursuit;
    }
    public Proxy(String name,Schoolgirl schoolgirl){
        this.name = name;
        this.schoolgirl = schoolgirl;
        if (this.pursuit == null){
           this.setPursuit(new Pursuit("卓贾易",schoolgirl));
        }
    }

    @Override
    public void sendFlower(){
        pursuit.sendFlower();
        System.out.println("代理者" + name + "给学校女孩" + this.getSchoolgirl().getName() + "送花");
    }
    @Override
    public void sendChocolate(){
        pursuit.sendChocolate();
        System.out.println("代理者" + name +  "给学校女孩" + this.getSchoolgirl().getName() + "送巧克力");
    }
}
