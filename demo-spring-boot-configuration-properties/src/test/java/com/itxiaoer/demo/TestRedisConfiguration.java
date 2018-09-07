package com.itxiaoer.demo;

import com.itxiaoer.demo.config.RedisConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisConfiguration {


    private RedisConfiguration redisConfiguration;



    @Test
    public void redisConfiguration() {
        System.out.println("redis database : " + redisConfiguration.getDatabase());
        System.out.println("redis host : " + redisConfiguration.getHost());
        System.out.println("redis port : " + redisConfiguration.getPort());
        System.out.println("redis password : " + redisConfiguration.getPassword());

    }

    @Autowired
    public void setRedisConfiguration(RedisConfiguration redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
    }
}
