package com.fufulong.state_model;

import com.fufulong.Observer_model.StackObserver;

public class ForenoonState extends State {
    public ForenoonState(){}
    @Override
    public void showState(Work work) {
        /**
         * 上午9点(包括)到中午12点(不包括)之间是上午工作状态
         */
        Integer hour = work.getHour();
        if(hour < 9){
            //时间小于9点,状态切换到 morningState,并执行一次判断
            work.setState(new MorningState());
            work.request();
        }else if (hour < 12){
            //时间在9点和12点之间,才是ForenoonState状态
            System.out.println("现在的时间是:" + hour + "点,上午工作状态:精力充沛,努力工作");
        }else{
            //时间大于等于,切换到 NoonState判断
            work.setState(new NoonState());
            work.request();
        }
    }
}
