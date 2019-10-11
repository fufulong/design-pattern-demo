package com.fufulong.factory_model;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.getOperation("+");
        Double result = operation.getResult(2.4, 55.7);
        System.out.println("得到的结果是: " + result);
    }
}
