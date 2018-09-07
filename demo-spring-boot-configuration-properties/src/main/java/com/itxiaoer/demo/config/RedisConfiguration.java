package com.itxiaoer.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : liuyk
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfiguration {
    private String database;
    private String host;
    private String port;
    private String password;
}
