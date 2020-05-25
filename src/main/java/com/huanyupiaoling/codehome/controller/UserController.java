package com.huanyupiaoling.codehome.controller;

import com.huanyupiaoling.codehome.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
//@RequestMapping("/user")
public class UserController {


    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    UserService userService;




}
