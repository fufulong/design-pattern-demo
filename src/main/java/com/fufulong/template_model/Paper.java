package com.fufulong.template_model;

/**
 * 试卷模板类
 */
public abstract class Paper {
    protected String name;
    public void insertname(String name){
        this.name = name;
    }
    //写出两个抽象的虚方法,表示题目1和题目2的填写答案
    protected abstract String answer1();
    protected abstract String answer2();
    //写出一张试卷2道题的题目和答案的展示
    public void testQuestion1(){
        System.out.println("这是第1道题的题目");
        System.out.println("答案是" + answer1());
    }
    public void testQuestion2(){
        System.out.println("这是第2道题的题目");
        System.out.println("答案是" + answer2());
    }
}
