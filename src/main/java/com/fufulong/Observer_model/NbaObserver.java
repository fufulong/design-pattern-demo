package com.fufulong.Observer_model;

import lombok.Data;

@Data
public class NbaObserver implements Observer {
    private String name ;
    private Subject subject;
    public NbaObserver(String  name ,Subject subject){
        this.name =  name ;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(this.subject.getAction() + ",看NBA球赛的员工"+this.name +"重新开始工作了");
    }
}
