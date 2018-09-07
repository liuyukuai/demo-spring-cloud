package com.itxiaoer.package3;

import com.itxiaoer.package1.Package1;
import com.itxiaoer.package2.Package2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : liuyk
 */
@ComponentScan("com.itxiaoer.package1,com.itxiaoer.package2")
public class Package3Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Package3Application.class, args);

        Package1 package1 = context.getBean(Package1.class);
        System.out.println("package1 = " + package1);


        Package2 package2 = context.getBean(Package2.class);
        System.out.println("package2 = " + package2);


        Package3 package3 = context.getBean(Package3.class);
        System.out.println("package3 = " + package3);

        // 执行结果 指定扫描的包都扫描到了，没有指定的包无法扫描
//        package1 = com.itxiaoer.package1.Package1@1ecee32c
//        package2 = com.itxiaoer.package2.Package2@4535b6d5
//        No qualifying bean of type 'com.itxiaoer.package3.Package3' available

    }
}
