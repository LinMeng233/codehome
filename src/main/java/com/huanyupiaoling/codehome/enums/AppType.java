package com.huanyupiaoling.codehome.enums;

/**
 * Description:
 *
 * @CreateDate: 2020/5/25 10:37
 * @author: LinYiBo
 */
public enum AppType {
    //ios
    IOS("ios","ios"),
    //安卓
    ANDROID("android","android");

    private String msg;
    private String code;

    private AppType(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}