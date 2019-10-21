package com.fufulong.bridge_model;

import lombok.Data;

/**
 * 游戏软件
 */
@Data
public class GameSoft extends MobileSoftWare {
    public GameSoft(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "软件运行");
    }
}
