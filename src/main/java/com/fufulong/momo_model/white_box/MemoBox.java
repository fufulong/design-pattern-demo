package com.fufulong.momo_model.white_box;

/**
 * 保存备忘录的箱子
 */
public class MemoBox {
    private Memo memo;
    //保存和得到备忘录的方法,这里按照设计安全性,不能有能够访问Memo的属性的方法
    public void save(Memo memo){
        this.memo = memo;
    }
    public Memo get(){
        return this.memo;
    }
}
