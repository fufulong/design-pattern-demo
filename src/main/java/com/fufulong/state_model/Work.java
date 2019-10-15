package com.fufulong.state_model;

import lombok.Data;

/**
 * 工作类.也就是状态模式的上下文,这里面需要依赖状态,
 * 为了避免构造函数循环依赖,我们不能加上 Work(State state);
 *
 */
@Data
public class Work {
    private Integer hour;
    private Boolean finished ;
    private State state;

    //空参数构造方法,默认的状态从9点之前的状态开始,上下文的构造方法最好不要有State参数,否则需要在客户端中执行
    //好几步的步骤,才能完成 work和State的相互实例依赖的完整实例化.
    public Work(){
        this.state = new MorningState();
        this.finished  = false;
    }
    //工作类中还需要一个方法,执行state实例的showState()方法,是上下文启动一次判断动作的方法
    public void request(){
        this.state.showState(this);
    }
    public void setHour(Integer hour){
        if (hour == null || hour < 0 || hour > 24){
            throw new RuntimeException("参数hour的值只能是0到24之间的正整数");
        }
        this.hour = hour;
    }
}
