package com.fufulong.flyWeight_model;

import lombok.Data;

/**
 * 非享元类,可能的值千变万化,不固定
 * 行为
 */
@Data
public class Action {
    //行为的名称
    public String name;
    public Action(String name ){
        this.name = name;
    }


}
