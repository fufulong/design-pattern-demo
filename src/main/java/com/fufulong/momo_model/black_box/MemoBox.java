package com.fufulong.momo_model.black_box;

import com.fufulong.momo_model.white_box.Memo;

/**
 * 备忘录保存箱
 */
public class MemoBox implements IMemoBox{
    private IMemoBox memo;

    public void saveMemo(IMemoBox memo){
        this.memo = memo;
    }

    public IMemoBox getMemo(){
        return this.memo;
    }
}
