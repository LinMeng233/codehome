package com.huanyupiaoling.codehome;

import com.huanyupiaoling.codehome.model.User;
import com.huanyupiaoling.codehome.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.locks.ReentrantReadWriteLock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml","classpath:application.xml"})
@ComponentScan("com.huanyupiaoling.codehome")
public class UserTest  {
    @Autowired
    UserService userService;
    final ReentrantReadWriteLock lock = new ReentrantReadWriteLock ();


    @Test
    public void test() {
        User user = userService.selectUser(123456789);
    }
}
