package com.fufulong.dutyChain_model;

/**
 * 抽象处理类,实例可以使版主人,系主任,学院院长,教导处处长等
 */
public abstract class Leader {
    //满足处理条件的时候的下一位处理者
    protected Leader nextLeader;
    protected void setNextLeader(Leader leader) {
        this.nextLeader = leader;
    }
    protected Leader getNextLeader(){
        return this.nextLeader;
    }
    //处理请假的处理方法,不同的请假天数有不同的人处理
    protected abstract void handleHoliday(Integer days);
}
