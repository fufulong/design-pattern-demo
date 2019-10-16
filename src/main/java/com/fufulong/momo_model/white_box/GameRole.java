package com.fufulong.momo_model.white_box;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 游戏角色.要求游戏角色的属性值能够存储和回复到原来
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameRole {
    //攻击力
    private Integer attack;
    //防御力
    private Integer defence;
    //经验值
    private Integer experience;
    //生命
    private Integer health;
    //存档保存的地方
    private MemoBox box;

    //初始化状态,满血
    public void  init(){
        this.setAttack(100);
        this.setDefence(100);
        this.setExperience(100);
        this.setHealth(100);
        System.out.println("初始化了角色");
    }

    //打Boss失败,经验 + 0,血条消失
    public void attackBossFail(){
        this.setHealth(0);
        System.out.println("打BOSS,失败了 QAQ");
    }

    //存档
    public void createMemo(){
        if (this.getBox() == null){
            this.setBox(new MemoBox());
        }
        Memo memo = new Memo(this.getExperience(), this.getHealth());
        this.box.save(memo);
        System.out.println("创建了备忘录");
    }

    //回档
    public void retreat(){
        Memo memo = this.getBox().get();
        this.setExperience(memo.getExperience());
        this.setHealth(memo.getHealth());
        System.out.println("回档成功");
    }

    //显示当前角色的攻击力,防御力,经验值,血量
    public void show(){
        System.out.println("当前角色的状态: 攻击力: " + attack + ", 防御力: "  + defence + ", 经验值: " +
                experience + ", 血量: " + health);
    }

}
