package com.fufulong.bridge_model;

/**
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {
        MobileBrand huawei = new HuaweiBrand("华为");
        MobileSoftWare gameSoft = new GameSoft("游戏");
        MobileSoftWare addressSoft = new AddressSoftWare("通讯录");
        MobileSoftWare phoneSoft = new PhoneSoft("电话");
        huawei.addSoft(gameSoft);
        huawei.addSoft(addressSoft);
        huawei.addSoft(phoneSoft);

        MobileBrand xiaomi = new XiaomiBrand("小米");
        xiaomi.addSoft(addressSoft);
        xiaomi.addSoft(phoneSoft);

        huawei.display();
        huawei.runAll();
        xiaomi.display();
        xiaomi.runAll();
    }
}
