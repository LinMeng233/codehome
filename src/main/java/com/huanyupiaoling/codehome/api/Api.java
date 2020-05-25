package com.huanyupiaoling.codehome.api;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Api {
    String value();

    boolean loginFree() default false;

    boolean autoLogin() default false;
}