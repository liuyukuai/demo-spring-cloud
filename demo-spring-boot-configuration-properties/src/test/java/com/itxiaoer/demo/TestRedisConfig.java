package com.itxiaoer.demo;

import com.itxiaoer.demo.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisConfig {


    private RedisConfig redisConfig;


    @Test
    public void redisConfig() {
        System.out.println("redis database : " + redisConfig.getDatabase());
        System.out.println("redis host : " + redisConfig.getHost());
        System.out.println("redis port : " + redisConfig.getPort());
        System.out.println("redis password : " + redisConfig.getPassword());

    }

    @Autowired
    public void setRedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
    }
}
