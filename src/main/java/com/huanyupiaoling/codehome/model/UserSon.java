package com.huanyupiaoling.codehome.model;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserSon {
    public long id=2;
    private Map<String,String> dataMap;
    public void put(String key,String value){
        dataMap.put(key,value);
    }
    public String get(String key){
        return dataMap.get(key);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
