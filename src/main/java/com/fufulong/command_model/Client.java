package com.fufulong.command_model;

public class Client {
    public static void main(String[] args) {
        CuerrentCommand1 command1 = new CuerrentCommand1("第1种命令");
        CuerrentCommand2 command2 = new CuerrentCommand2("第2种命令");
        Receiver receiver = new Receiver("执行者张三");
        Invoker invoker = new Invoker();
        invoker.setName("翠花");
        invoker.setReceiver(receiver);

        //顾客选择执行命令,invoker记录
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.addCommand(command1);
        invoker.removeCommand(command1);

        //invoker通知执行命令
        invoker.exe();
    }
}
