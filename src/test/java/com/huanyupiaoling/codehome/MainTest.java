package com.huanyupiaoling.codehome;



import com.huanyupiaoling.codehome.app.Appconfig;
import com.huanyupiaoling.codehome.model.UserSon;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 */
public class MainTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(UserSon.class));



    }
}
