package com.fufulong.command_model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 命令管理者
 */
@Data
public class Invoker {
    private String name;
    private List<Command> commands = new ArrayList<>();
    private Receiver receiver;
    public void addCommand(Command command){
        commands.add(command);
        System.out.println(this.getName() + "加上了命令" + command.getName() + ",时间"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    public void removeCommand(Command command){
        commands.remove(command);
        System.out.println(this.getName() + "减去了命令" + command.getName() + ",时间"
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    //开始执行
    public void exe(){
        commands.stream().forEach(command -> command.run(this.getReceiver()));
    }
}
