package com.fufulong.Observer_model;

import lombok.Data;

/**
 * 炒股的同事,观察者
 */
@Data
public class StackObserver implements Observer{
    private String name ;
    //观察者必须关联通知者
    private Secretary secretary;
    public StackObserver(String name ,Secretary secretary){
        this.name = name;
        this.secretary = secretary;
    }
    //接受到通知者通知之后的需要作出的动作
    @Override
    public void update(){
        System.out.println( this.secretary.getAction() + ",同事" + this.name + "停止了炒股,重新开始工作");
    }
}
