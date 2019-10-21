package com.fufulong.composite_model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 公司类,相当于枝
 */
public class Company extends Component {
    //枝需要有下一层级的枝叶
    public List<Component> children ;
    //当前枝叶的层级,默认从1开始
    public Integer level ;
    //当前公司的名称
    public String name ;
    public Company(String name ){
        this.name = name;
        this.level = 1;
        this.children = new ArrayList<>();
    }
    public void setLevel(Integer level){
        this.level = level;
    }
    public Integer getLevel(){
        return this.level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addComponent(Component component) {
        children.add(component);
    }

    @Override
    public void subComponent(Component component) {
        children.remove(component);
    }

    @Override
    public void display() {
        //先展示本层,再展示子层
        System.out.println(String.join("", Collections.nCopies(level,"-")) + " " + this.getName());
        for (Component component : children){
            //子类的level都需要在父类的level上加上2
            component.setLevel(this.getLevel() + 2);
            component.display();
        }
    }
}
