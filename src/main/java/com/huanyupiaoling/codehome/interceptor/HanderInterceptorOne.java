package com.huanyupiaoling.codehome.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HanderInterceptorOne implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Cookie[] cookies=httpServletRequest.getCookies();
        System.out.println(httpServletRequest.getSession());
        System.out.println(httpServletRequest.getHeaderNames());
        Cookie cookie=new Cookie("userName","sb");
        cookie.setMaxAge(60*60*24*365);
        httpServletResponse.addCookie(cookie);
        System.out.println();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}