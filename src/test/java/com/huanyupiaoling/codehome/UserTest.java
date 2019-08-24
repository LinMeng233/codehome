package com.huanyupiaoling.codehome;

import com.huanyupiaoling.codehome.dao.UserDao;
import com.huanyupiaoling.codehome.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserTest {
    @Autowired
    UserDao userDao;




    @Test
    public void test(){
        long id=1;
        User user=userDao.selectUser(id);
        System.out.println(user.getUsername());
        Thread[] ts=new Thread[10];
        for(int i=0;i<10;i++){
            ts[i]=new Thread(){
                @Override
                public void run(){
                    while (true)
                    System.out.println(Thread.currentThread().getName());
                }

            };
            ts[i].setName("线程"+i);
            ts[i].start();

        }
    }
}
