package com.fufulong.command_model;

import com.fufulong.composite_model.Component;
import lombok.Data;

/**
 * 具体命令1
 */
@Data
public class CuerrentCommand1 extends Command {
    public CuerrentCommand1(String name) {
        super(name);
    }
}
