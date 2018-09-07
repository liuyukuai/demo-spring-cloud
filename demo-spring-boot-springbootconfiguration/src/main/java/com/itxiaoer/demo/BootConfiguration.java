package com.itxiaoer.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : liuyk
 */
@SpringBootConfiguration
public class BootConfiguration {


    /**
     * 代表在spring容器中创建了一个名字为userMap的对象，值为该方法的返回值。
     *
     * @return map对象
     */
    @Bean
    public Map<String, String> userMap() {
        Map<String, String> map = new HashMap<>(2);
        map.put("id", "id");
        map.put("name", "name");
        return map;
    }
}
