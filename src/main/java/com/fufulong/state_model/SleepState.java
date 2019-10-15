package com.fufulong.state_model;

/**
 * 23点之后,上床睡觉的状态,注意边界值
 */
public class SleepState extends State {
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        Boolean finished = work.getFinished();
        if (hour >= 23){
            System.out.println("现在的时间是:" + hour +"点,是否完成工作:" + finished + ",23点之后上床睡觉了");
        }else{
            //如果没有到23点,切换到RestState继续判断
            work.setState(new RestState());
            work.request();
        }
    }
}
