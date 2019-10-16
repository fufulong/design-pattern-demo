package com.fufulong.decorator_model;

/**
 * 领带类
 */
public class Tie extends Costume{
    @Override
    public void show() {
        System.out.print("打着领带的, ");
        Person person = this.getPerson();
        if (person != null){
            person.show();
        }
    }
    public void decorator(Person person){
        this.setPerson(person);
    }
}
