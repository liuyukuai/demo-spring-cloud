package com.itxiaoer.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : liuyk
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {

    @Bean
    public Bar bar() {
        return new Bar();
    }

}

class Bar {

    public void say() {
        System.out.println("hello bar");
    }

}
