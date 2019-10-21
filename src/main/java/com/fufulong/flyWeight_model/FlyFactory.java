package com.fufulong.flyWeight_model;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元对象工厂,维护一个 hashmap,使外界得到的男人或者是女人只有一个实例,
 * 节约内存
 */
public class FlyFactory {
   private Map<String ,FlyWeight> map = new HashMap<>(2);
   public FlyWeight getFlyweight(String key){
       if (StringUtils.isEmpty(key)){
           System.out.println("key不能是空");
           return null;
       }
       if (!key.equals("男人") && !key.equals("女人")){
           System.out.println("key的值错误");
           return null;
       }
       FlyWeight flyWeight = map.get(key);
       if(flyWeight == null){
           if (key.equals("男人")){
              flyWeight = new Men();
              map.put(key,flyWeight);
           }else{
               flyWeight = new Women();
               map.put(key,flyWeight);
           }
       }

       return flyWeight;
   }
}
