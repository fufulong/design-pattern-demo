package com.fufulong.state_model;

/**
 * 中午的状态
 */
public class NoonState extends State{
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        if( hour < 12){
            //如果日期小于12点,切换到ForenoonState判断
            work.setState(new ForenoonState());
            work.request();
        }else if(hour < 14){
            //时间在12点(包含)到14点(不包含)之间,是午休状态
            System.out.println("现在的时间是:" + hour + "点,是中午的工作状态:吃饭和午休");
        }else{
            //时间在14点(包含)之后,切换到 AftetnoonStatea判断
            work.setState(new AfterNoonState());
            work.request();
        }
    }
}
