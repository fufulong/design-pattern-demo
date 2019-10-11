package com.fufulong.factory_model;

public class OperationAdd extends Operation {
    @Override
    public Double getResult(Double number1, Double number2) {
        if (number1 == null || number2 == null){
            throw new RuntimeException("加法运算的数字不能是空");
        }
        return number1 + number2;
    }
}
