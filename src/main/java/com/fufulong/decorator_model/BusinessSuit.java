package com.fufulong.decorator_model;

/**
 * 西装类
 */
public class BusinessSuit extends Costume{
    @Override
    public void show() {
        //先本身装饰代码.在被装饰者的代码
        System.out.print("穿着西装的, ");
        Person person = this.getPerson();
        if (person != null){
            person.show();
        }
    }

    public void decorator(Person person){
        this.setPerson(person);
    }
}
