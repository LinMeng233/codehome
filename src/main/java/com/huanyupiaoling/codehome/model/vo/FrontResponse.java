package com.huanyupiaoling.codehome.model.vo;

import com.huanyupiaoling.codehome.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class FrontResponse {
    private String code;
    private String desc;
    private Object data;
    @Resource
    private User user;


    public FrontResponse() {
        System.out.println();
    }

    public FrontResponse(String code, String desc, Object data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
