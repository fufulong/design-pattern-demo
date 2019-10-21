package com.fufulong.dutyChain_model;

/**
 * 班主任
 */
public class Teacher extends Leader {
    /**
     * 当请假天数在1到3天的时候由班主任批准
     * @param days:请假天数
     */
    @Override
    protected void handleHoliday(Integer days) {
        if(days <= 0){
            System.out.println("请假天数不能为负数或者0");
            return;
        }
        if(days > 0 && days <= 3){
            System.out.println("请假天数: " + days + "天,由班主任处理" );
        }else if (this.getNextLeader() != null){
            this.getNextLeader().handleHoliday(days);
        }else{
            //如果一条指责链上都找不到处理者,写出提示
            System.out.println("请假天数:" + days +"天,请假天数太多,不予处理");
        }

    }
}
