package com.fufulong.dutyChain_model;

/**
 * 系主任
 */
public class DepartmentHead extends Leader{
    /**
     * 系主任能够审批 4到7天的假期
     * @param days
     */
    @Override
    protected void handleHoliday(Integer days) {
        if(days <= 0){
            System.out.println("请假天数不能是负数或者是0");
            return;
        }
        if(days >= 4 && days <= 7){
            System.out.println("请假天数:" + days + "天,由系主任处理");
        }else if (this.getNextLeader() != null){
            this.getNextLeader().handleHoliday(days);
        }else{
            System.out.println("请假天数:" + days + "天,请假天数太多,不予批准");
        }
    }
}
