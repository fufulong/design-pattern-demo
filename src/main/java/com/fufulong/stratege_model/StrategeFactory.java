package com.fufulong.stratege_model;

public class StrategeFactory {
    public Stratege create(StrategeEnum strategeEnum){
        Class clazz = strategeEnum.getClazz();
        try {
            Stratege stratege =(Stratege) clazz.newInstance();
            return stratege;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
