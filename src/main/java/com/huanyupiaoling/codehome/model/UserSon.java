package com.huanyupiaoling.codehome.model;

import java.util.Map;

public class UserSon extends User{
    private Map<String,String> dataMap;
    public void put(String key,String value){
        dataMap.put(key,value);
    }
    public String get(String key){
        return dataMap.get(key);
    }
}
