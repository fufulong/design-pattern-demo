package com.fufulong.momo_model.white_box;

import lombok.Data;

/**
 * 游戏角色备忘录,保存血量和经验值就行
 */
@Data
public class Memo {
    private Integer experience;
    private Integer health;
    public Memo(Integer experience,Integer health){
        this.experience = experience;
        this.health = health;
    }
}
