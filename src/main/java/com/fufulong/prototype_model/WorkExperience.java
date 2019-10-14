package com.fufulong.prototype_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 工作经验类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String conpany;

    @Override
    public String toString() {
        return "WorkExperience{" +
                "timeArea='" + timeArea + '\'' +
                ", conpany='" + conpany + '\'' +
                '}';
    }

    /**
     * 因为Object的Clone()方法是protect的权限,所以需要重写一个Public方法,
     * 内部调用
     * @return
     */
    public WorkExperience clone(){
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return workExperience;

    }
    public void display(){
        System.out.println(this.toString());
    }
}
