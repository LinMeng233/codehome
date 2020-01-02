package com.huanyupiaoling.codehome;

import com.alibaba.fastjson.JSONObject;
import com.huanyupiaoling.codehome.app.Appconfig;
import com.huanyupiaoling.codehome.model.User;
import com.huanyupiaoling.codehome.model.UserSon;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args){
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
//        System.out.println(annotationConfigApplicationContext.getBean(UserSon.class));
        User user=new User();
        user.setUsername("sb");
        user.setEmail("291157220");
        String str=JSONObject.toJSONString(user);
        System.out.println(str);

    }
}
