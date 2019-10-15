package com.fufulong.state_model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 状态模式测试客户端程序
 */
public class Client {
    public static void main(String[] args) {
        //1.先试试常规多分支没有抽象出对象的写法
//        test1();
        test2();
    }

    public static void test1() {
        Work1 work1 = new Work1();
        work1.setFinished(false);
        //9点,没有完成工作的状态
        work1.setHour(8);
        work1.workPrograming();
        //11点
        work1.setHour(11);
        work1.workPrograming();
        //13点
        work1.setHour(13);
        work1.workPrograming();
        //16点
        work1.setHour(16);
        work1.workPrograming();
        //19点,没有完成工作
        work1.setHour(19);
        work1.workPrograming();
        //20点没有完成工作,或者完成了工作
        work1.setHour(20);
//        work1.setFinished(true);
        work1.workPrograming();
        //21点
        work1.setHour(21);
        work1.workPrograming();
        //22点
        work1.setHour(22);
        work1.workPrograming();
        //23点
        work1.setHour(23);
        work1.workPrograming();
    }

    public static void test2() {
        //1,先随机造出乱序的时间节点,7到23都有,但是顺序不一致
        ArrayList<Integer> hours = new ArrayList<>(17);
        for (int i = 7; i <= 23; i++) {
            hours.add(i);
        }
        Collections.shuffle(hours);
        System.out.println("打乱后的时间节点顺序是:");
        hours.stream().forEach(item -> {
            System.out.print(item + ", ");
        });
        System.out.println();
        //创建状态从 morningState开始work对象,finished默认是false
        Work work = new Work();
        //循环 hours,分别给work设置时间,这里先测一致没完成工作的
        hours.stream().forEach(hour -> {
                    work.setHour(hour);
                    //如果设置晚上20点完成工作
                    if(hour >= 20){
                        work.setFinished(true);
                    }else{
                        work.setFinished(false);
                    }
                    work.request();
                }
        );
    }
}
