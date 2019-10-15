package com.fufulong.state_model;

import lombok.Data;

/**
 * 状态抽象类
 */
@Data
public abstract class State {
    //定义抽象方法,这个方法是根据work的hour和finished属性,做出不同的动作
    public abstract void showState(Work work);

}
