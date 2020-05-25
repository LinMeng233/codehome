package com.huanyupiaoling.codehome;

import com.huanyupiaoling.codehome.enums.AppType;

/**
 *
 */
public class MainTest {

    public static void main(String[] args){
        AppType appType = AppType.IOS;
        if(AppType.IOS.equals(appType)){
            System.out.println("IOS");
        }
        if(AppType.ANDROID.equals(appType)){
            System.out.println("ANDROID");
        }

    }
}

