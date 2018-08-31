package com.itxiaoer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author : liuyk
 */
@RestController
@SpringBootApplication
public class DemoSpringBootApplication {


    @GetMapping("/hello")
    public String hello(HttpServletResponse response) {
        return "Hello world";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoSpringBootApplication.class, args);
    }
}
