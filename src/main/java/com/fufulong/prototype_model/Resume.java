package com.fufulong.prototype_model;

/**
 * 简历类,原型
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private WorkExperience workExperience;

    //空参数构造方法
    public Resume() {
        this.workExperience = new WorkExperience();
    }

    //只有名字参数的构造方法,初始化name 的同时也要初始化 workExperience
    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    //私有化的设置工作经验具体属性值的方法
    public void setWorkExperience(String timeArea, String company) {
        workExperience.setConpany(company);
        workExperience.setTimeArea(timeArea);

    }

    //简历克隆方法,先试试浅复制的效果
    public Resume clone() {
        Resume resume = null;
        try {
            /*
            Object.clone()方法不走构造方法,直接走的内存的二进制流,因此创建对象特别快,
            适合创建特别消耗资源的对象,为了安全的使用这个方法,这个类需要实现java的Cloneable接口.
            不过这个方法都是浅复制,值类型的属性复制没有问题,但是数组,容器对象,引用类型的对象属性
           值就不会复制一份,如果需要深复制,需要调用他们的 clone()方法.
             */
            resume = (Resume) super.clone();
            resume.workExperience =  this.workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }


    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }

    public void display() {
        System.out.println(this.toString());
    }
}
