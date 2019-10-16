package com.fufulong.decorator_model;

import lombok.Data;

/**
 * T恤类
 */
@Data
public class Tshirt extends Costume {
    private String color;
    @Override
    public void show() {
        //先装基本的,再穿基本的
        System.out.print(this.getColor() + "T恤, ");
        //被装饰的对象的原先的对应行为
        Person person = this.getPerson();
        if (person != null){
           person.show();
        }
    }

    public void decorator(Person person){
        this.setPerson(person);
    }

    // 这个类独有的方法
    public void showColor(){
        System.out.println("这件T恤是" + this.getColor() + "的");
    }

}
