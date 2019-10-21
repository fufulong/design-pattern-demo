package com.fufulong.bridge_model;

import lombok.Data;

/**
 * 通讯录软件
 */
@Data
public class AddressSoftWare extends MobileSoftWare {
    public AddressSoftWare(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "软件运行");
    }
}
