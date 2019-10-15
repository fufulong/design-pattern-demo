package com.fufulong.state_model;

/**
 * 早上未上班的状态
 */
public class MorningState extends State {
    /**
     * 上下文必须能够先独立于State创建
     */
    public MorningState() {
    }

    /**
     * 上下文必须能够先独立于State创建
     */
    @Override
    public void showState(Work work) {
        Integer hour = work.getHour();
        if (hour < 9 && hour > 0) {
            //如果时间早于9点
            System.out.println("现在的时间是:" + hour + "点,没有开始工作");
        } else {
            //如果时间大于等于9点,切换到 ForenoonState状态分支,上下文再执行一次判断
            work.setState(new ForenoonState());
            work.request();
        }

    }
}
