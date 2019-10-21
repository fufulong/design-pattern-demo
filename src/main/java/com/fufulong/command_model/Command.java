package com.fufulong.command_model;

import lombok.Data;

import java.util.Objects;

/**
 * 抽象命令类
 */
@Data
public abstract class Command {
    //命令的名字
    public String name;

    public Command(String name ){
        this.name = name;
    }
    //命令抽象的执行方式
    public void run(Receiver receiver){
       receiver.doCommand(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return Objects.equals(name, command.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
