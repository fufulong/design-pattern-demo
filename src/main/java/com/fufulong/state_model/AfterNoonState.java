package com.fufulong.state_model;

    public class AfterNoonState extends State {
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        if (hour < 14){
            //如果时间小于14点,切换到NoonState判断
            work.setState(new NoonState());
            work.request();
        }else if (hour < 18){
            //如果时间在12点到18点之间,才是下午的工作状态
           System.out.println("现在的时间是:" + hour + "点,是下午的工作状态:有点困,坚持工作");
        }else{
            //如果时间在18点之后,切换到 EveningState判断
            work.setState(new EveningState());
            work.request();
        }
    }
}
