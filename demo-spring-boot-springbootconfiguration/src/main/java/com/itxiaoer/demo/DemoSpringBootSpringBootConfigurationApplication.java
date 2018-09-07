package com.itxiaoer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 * @author : liuyk
 */
@SpringBootApplication
public class DemoSpringBootSpringBootConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringBootSpringBootConfigurationApplication.class, args);

        Map<String, Object> userMap = (Map<String, Object>) applicationContext.getBean("userMap");
        userMap.forEach((k, v) -> System.out.println(k + "=" + v));


    }
}
