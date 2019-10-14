package com.fufulong.builder_model;

import lombok.Data;

/**
 * 一副画,画画需要按照顺序,执行3步:画出轮廓,添加线条细节,上色
 * 不同的话有不同的轮廓,不同的线条细节和不同的上色方式.
 */
@Data
public class Paiting {
    //轮廓
    private String outline;
    //线条细节
    private String lineDetails;
    //上色方式
    private String colorStyle;
    //展现画的三个方面
    public void show(){
        System.out.println(this.toString());
    }


}
