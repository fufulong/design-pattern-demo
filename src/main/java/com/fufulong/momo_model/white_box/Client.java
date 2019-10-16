package com.fufulong.momo_model.white_box;

/**
 * 客户端程序
 */
public class Client {

    public static void main(String[] args) {
        //玩游戏的过程
        //1,进来之后,是满状态
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.show();
        //2.打boss之前,存了一个档
        MemoBox box = new MemoBox();
        gameRole.setBox(box);
        gameRole.createMemo();
        /**
         * 创建存档之后,应为存档对象对所有可见,也就是里面保存的]
         * 属性(经验值和血量)是可以得到和操作的,这并不安全.
         * 虽然可以靠程序员自我约束,但是这并不可靠.这种备忘录的写法就叫"白箱"模式
         */
        gameRole.show();
        //3.然后去到了Boss,并且失败了
        gameRole.attackBossFail();
        gameRole.show();
        //4.他选择了回档
        gameRole.retreat();
        gameRole.show();

    }
}
