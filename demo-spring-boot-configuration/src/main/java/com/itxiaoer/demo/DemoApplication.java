package com.itxiaoer.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : liuyk
 */
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置类
        context.register(ConfigB.class);
        // 刷新容器
        context.refresh();

        Foo foo = context.getBean(Foo.class);
        foo.say();

    }
}
