package com.fufulong.composite_model;

import lombok.Data;

import java.util.Base64;
import java.util.Collections;

/**
 * 具体的部门类,相当于component的叶,没有子节点
 */
@Data
public class Department  extends Component{
    //部门只有名字,和level,没有下级Component节点集合
    private String name ;
    private Integer level;
    public Department (String name){
        this.name = name;
        this.level = 1;
    }
    @Override
    public void addComponent(Component component) {
        //这里不写代码,保留只是为了结构一致性
    }

    @Override
    public void subComponent(Component component) {
        //这里不写代码,保留只是为了结构一致性
    }

    @Override
    public void display() {
        //部门直接打出名字即可
        System.out.println(String.join("", Collections.nCopies(level,"-")) +" "+this.getName());
    }
}
