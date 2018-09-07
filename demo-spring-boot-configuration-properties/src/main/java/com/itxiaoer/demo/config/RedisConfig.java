package com.itxiaoer.demo.config;

import lombok.Data;

/**
 * @author : liuyk
 */
@Data
public class RedisConfig {
    private String database;
    private String host;
    private String port;
    private String password;
}
