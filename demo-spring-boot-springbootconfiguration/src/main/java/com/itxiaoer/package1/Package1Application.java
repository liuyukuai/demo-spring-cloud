package com.itxiaoer.package1;

import com.itxiaoer.package2.Package2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : liuyk
 */
@ComponentScan
public class Package1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Package1Application.class, args);

        Package1 package1 = context.getBean(Package1.class);
        System.out.println("package1 = " + package1);

        Package2 package2 = context.getBean(Package2.class);
        System.out.println("package2 = " + package2);

        // 执行结果 package1对象扫描到了，package2没有扫描到
        // package1 = com.itxiaoer.package1.Package1@34cdeda2
        //  No qualifying bean of type 'com.itxiaoer.package2.Package2' available

    }


}
