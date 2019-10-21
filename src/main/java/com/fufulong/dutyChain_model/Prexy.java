package com.fufulong.dutyChain_model;

public class Prexy extends Leader {
    /**
     * 学员院长可以批准8到15天的假期
     * @param days
     */
    @Override
    protected void handleHoliday(Integer days) {
        if (days <= 0){
            System.out.println("请假天数不能是负数或者0");
            return;
        }

        if( days >= 8 && days <= 15){
            System.out.println("请假天数: " + days + "天,由学院院长批准");
        }else if (this.getNextLeader() != null){
            this.getNextLeader().handleHoliday(days);
        }else{
            System.out.println("请假天数:" + days +"天,请假天数太长,不予批准");
        }
    }
}
