package com.fufulong.stratege_model;

import lombok.Data;


public enum StrategeEnum {
    ADD_STRATEGE(0,"加法运算",AddStratege.class),
    SUB_STRATEGE(1,"减法运算",SubStratege .class),
    MI_STRATEGE(2,"幂运算",MiStratege.class);

    public Integer id;
    public String name;
    public Class clazz;

   private StrategeEnum(Integer id ,String name,Class<? extends Stratege> clazz){
       this.id = id;
       this.name = name;
       this.clazz = clazz;
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
