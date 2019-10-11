package com.fufulong.factory_model;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        Double number1 = Double.valueOf(scanner1.next());
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入运算符号(+,-,*,/,):");
        String operetion = scanner2.next().trim();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("请输入第二个数字:");
        Double number2 = Double.valueOf(scanner3.next());
        Double result = null;
        switch (operetion) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("输入的运算符号不支持");
                return;
        }
        System.out.println(number1 + " " + operetion + " " + number2 + " = " + result);
    }
}
