package com.fufulong.momo_model.black_box;

public class Client {
    public static void main(String[] args) {
        // 创建角色
        GameRole role = new GameRole();
        // role 初始化
        role.init();
        role.show();
        // role打算去打boss,先存个档
        role.createMemo();
        //打boss失败
        role.attackBossFail();
        role.show();
        //回档
        role.retreat();
        role.show();
    }
}
