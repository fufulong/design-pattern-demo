package com.fufulong.factory_model;

import org.springframework.util.StringUtils;

/**
 * 简单工厂
 */
public class OperationFactory {

    public Operation getOperation(String ope) {
        if (StringUtils.isEmpty(ope)) {
            throw new RuntimeException("运算符号不能是空");
        }
        Operation operation = null;
        switch (ope.trim()) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("运算符号不支持");
        }

        return operation;
    }
}
