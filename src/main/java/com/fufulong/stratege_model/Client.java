package com.fufulong.stratege_model;

public class Client {
    public static void main(String[] args) {
        test1();
    }

    public static  void test1(){
        StrategeFactory factory = new StrategeFactory();
        Integer numberA = 10;
        Integer numberB = 4;
        Stratege addStratege = factory.create(StrategeEnum.ADD_STRATEGE);
        addStratege.setNumberA(numberA);
        addStratege.setNumberB(numberB);
        addStratege.showResult();
        Stratege subStratege = factory.create(StrategeEnum.SUB_STRATEGE);
        subStratege.setNumberA(numberA);
        subStratege.setNumberB(numberB);
        subStratege.showResult();
        Stratege miStratege = factory.create(StrategeEnum.MI_STRATEGE);
        miStratege.setNumberA(numberA);
        miStratege.setNumberB(numberB);
        miStratege.showResult();
    }
}
