package com.itxiaoer.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liuyk
 */
@Configuration
public class ConfigA {

    public Foo foo() {
        return new Foo();
    }


    @Bean(initMethod = "init", destroyMethod = "cleanup", value = "foo2")
    public Foo foo2() {
        return new Foo();
    }
}

class Foo {

    public void say() {
        System.out.println("hello foo");
    }

    public void init() {
    }

    public void cleanup() {
    }

}
