package com.fufulong.factory_model;

/**
 * 减法操作
 */
public class OperationSub extends Operation {

    @Override
    public Double getResult(Double number1, Double number2) {
        if (number1 == null || number2 == null){
            throw new RuntimeException("减法运算的数字不能是空");
        }
        return number1 - number2;
    }
}
