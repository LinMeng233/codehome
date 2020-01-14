package com.huanyupiaoling.codehome.model;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserSon extends User{
    public long id=2;
    private Map<String,String> dataMap;
    public void put(String key,String value){
        dataMap.put(key,value);
    }
    public String get(String key){
        return dataMap.get(key);
    }
}
