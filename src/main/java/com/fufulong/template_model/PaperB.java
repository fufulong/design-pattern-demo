package com.fufulong.template_model;

/**
 * 学生B的试卷
 */
public class PaperB extends Paper{

    @Override
    protected String answer1() {
        return "学生B的试题1的答案";
    }

    @Override
    protected String answer2() {
        return "学生B的试题2的答案";
    }
}
