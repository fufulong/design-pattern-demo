package com.fufulong.factory_model;

/**
 * 除法类
 */
public class OperationDiv extends Operation{
    @Override
    public Double getResult(Double number1, Double number2) {
        if (number1 == null || number2 == null){
            throw new RuntimeException("除法的数字不能是空");
        }
        if(number2 == 0){
            throw new RuntimeException("除法的被除数不能是0");
        }

        return number1 / number2;
    }
}
