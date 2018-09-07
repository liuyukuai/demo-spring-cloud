package com.itxiaoer.demo;

import com.itxiaoer.demo.config.RedisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author : liuyk
 */
@SpringBootApplication
public class DemoSpringBootConfigurationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootConfigurationPropertiesApplication.class, args);
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.redis")
    public RedisConfig redisConfig() {
        return new RedisConfig();
    }
}
