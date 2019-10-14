package com.fufulong.template_model;

/**
 * 学生A的试卷,需要继承 Paper
 */
public class PaperA extends Paper {
    //重写答案
    @Override
    protected String answer1() {
        return "学生A的试题1的答案";
    }

    @Override
    protected String answer2() {
        return "学生A的试题2的答案";
    }
}
