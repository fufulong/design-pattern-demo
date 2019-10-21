package com.fufulong.dutyChain_model;

/**
 * 测试客户端
 */
public class Client {
    public static void main(String[] args) {
        //批准的顺序分别是 班主任(1到3天),系主任(4到7天),学院院长(8到15天),超过15天,一律不批准
        Leader leader1 = new Teacher();
        Leader leader2 = new DepartmentHead();
        Leader leader3 = new Prexy();
        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);
        //批准先到达班主任审批,最后实际到谁审批取决请假天数
        for(int i=1;i <= 17;i++){
            leader1.handleHoliday(i);
        }
    }
}
