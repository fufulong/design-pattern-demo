package com.fufulong.facade_model;

/**
 * 门面
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;
    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }
    public void method1(){
        System.out.println("进入执行Facade的方法method1");
        subSystemOne.method1();
        subSystemTwo.method2();
        subSystemThree.method3();
    }
    public void method2(){
        System.out.println("进入执行Facade的method2方法");
        subSystemThree.method3();
        subSystemTwo.method2();
    }
}
