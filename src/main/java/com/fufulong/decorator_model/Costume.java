package com.fufulong.decorator_model;

import lombok.Data;

/**
 * 打扮父类,子类是各种装扮
 */
@Data
public  class Costume implements Person {
    //客户端程序实际要传入Person的子类实例,也就是 Programmer等
    private Person person ;
    public Costume(Person person){
        this.person = person;
    }
    public Costume(){}
    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }

    public void decorator(Person person){
        this.person = person;
    }
}
