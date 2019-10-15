package com.fufulong.state_model;

public class EveningState extends State {

    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        Boolean finished = work.getFinished();
        if(hour < 18){
            //如果时间小于18点,切换到AfternoonState判断
            work.setState(new AfterNoonState());
            work.request();
        }else if(hour < 21){
            //在18点到21点之间,需要判断是否完成了本日工作
            if (finished){
                //如果完成了本日工作,切换到FinishedworkState
                work.setState(new FinishedWorkState());
                work.request();
            }else{
                //如果没有完成本日工作,才是晚间加班状态
                System.out.println("现在的时间是:" + hour + "点.是否完成本日工作:"+finished+
                        ".现在的工作状态:晚间加班工作,很困,效率低下");
            }

        }else{
            //如果时间大于等于21点,直接切换到RestState判断
            work.setState(new RestState());
            work.request();
        }
    }
}
