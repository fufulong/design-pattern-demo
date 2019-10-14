package com.fufulong.template_model;

/**
 * 客户端的测试程序
 */
public class Client {
    public static void main(String[] args) {
        Paper paper = null;
        paper = new PaperA();
        paper.testQuestion1();
        paper.testQuestion2();
        paper = new PaperB();
        paper.testQuestion1();
        paper.testQuestion2();
    }
}
