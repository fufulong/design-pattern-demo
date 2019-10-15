package com.fufulong.state_model;

/**
 * 晚上18点-21点,完成了工作的不用加班,21点之前下班的状态
 */
public class FinishedWorkState extends State {
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        Boolean finished = work.getFinished();
        if(hour >= 18 && hour <= 21 && finished){
            //只有18点到21点之间且完成了本日任务才是这个状态
            System.out.println("现在的时间:" + hour + "点,是否完成本日工作:" + finished + "," +
                    "完成工作,不用加班到21点,今日工作完毕,下班");
        }else{
            //否则切换到 EveningState判断
            work.setState(new EveningState());
            work.request();
        }
    }
}
