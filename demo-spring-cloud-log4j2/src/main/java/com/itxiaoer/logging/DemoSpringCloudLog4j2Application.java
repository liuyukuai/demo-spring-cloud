package com.itxiaoer.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author : liuyk
 */
@EnableScheduling
@SpringBootApplication
public class DemoSpringCloudLog4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudLog4j2Application.class, args);
    }
}
