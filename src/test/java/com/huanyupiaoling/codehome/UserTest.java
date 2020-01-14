package com.huanyupiaoling.codehome;

import com.huanyupiaoling.codehome.dao.UserDao;
import com.huanyupiaoling.codehome.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.locks.ReentrantReadWriteLock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserTest {
    @Autowired
    UserDao userDao;
    final ReentrantReadWriteLock lock = new ReentrantReadWriteLock ();



    @Test
    public void test(){
        lock.readLock().lock();
        User user=new User();
        user.setUsername("sb");
        user.setEmail("291157220");
        System.out.println();
    }
}
