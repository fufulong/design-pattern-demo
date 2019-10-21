package com.fufulong.command_model;

import lombok.Data;

/**
 * 命令执行者
 */
@Data
public class Receiver {
    //执行人的称呼
    private String name;
    public Receiver(String name){
        this.name = name ;
    }
    //下面是执行者执行不同命令的动作
    public void doCommand(Command command){
        if(command instanceof  CuerrentCommand1){
            System.out.println("执行命令1");
        }else if (command instanceof  CuerrentCommand2){
            System.out.println("执行命令2");
        }

    }
}
