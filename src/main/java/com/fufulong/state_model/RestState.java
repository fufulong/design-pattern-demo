package com.fufulong.state_model;

/**
 * 晚上21点之后,不管有没有完成本日工作的状态
 */
    public class RestState extends State {
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        Boolean finished = work.getFinished();
        if (hour < 21){
            //如果时间小于21点,切换到 EveningState转态判断
            work.setState(new EveningState());
            work.request();
        }else if (hour < 23){
            // 时间在21到23点之间,才是这个RestState的转态
            System.out.println("现在的时间是:" + hour +"点.是否完成本日工作:"+finished+
                    "现在的工作的状态:回到家中,休息,没有工作");
        }else{
            //时间大于等于23点,切换到sleepState判断
            work.setState(new SleepState());
            work.request();
        }
    }
}
