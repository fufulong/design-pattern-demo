package com.fufulong.bridge_model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 手机品牌抽象类
 */
@Data
public abstract class MobileBrand {
    protected String name ;
    protected List<MobileSoftWare> softWares ;
    public MobileBrand(String name){
        this.name = name;
        this.softWares = new ArrayList<>();
    }
    protected void addSoft(MobileSoftWare softWare){
        this.softWares.add(softWare);
    }

    protected void  removeSoft(MobileSoftWare mobileSoftWare){
        this.softWares.remove(mobileSoftWare);
    }

    public void display(){
        System.out.println("手机品牌 " + this.getName() + " 安装的软件如下:" );
        softWares.forEach(item -> System.out.print(item.getName() + " "));
        System.out.println();
    }
    public void runAll(){
        System.out.println("全部程序运行如下:");
        softWares.stream().forEach(item -> item.run());
    }
}
