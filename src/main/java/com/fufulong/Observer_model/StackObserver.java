package com.fufulong.Observer_model;

import lombok.Data;

/**
 * 炒股的同事,观察者
 */
@Data
public class StackObserver implements Observer{
    private String name ;
    //观察者必须关联通知者
    private  Subject subject;
    public StackObserver(String name , Subject subject){
        this.name = name;
        this.subject = subject;
    }
    //接受到通知者通知之后的需要作出的动作
    @Override
    public void update(){
        System.out.println( this.subject.getAction() + ",同事" + this.name + "停止了炒股,重新开始工作");
    }
}
