package com.itxiaoer.package2;

import com.itxiaoer.package1.Package1;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : liuyk
 */
@ComponentScan
public class Package2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Package2Application.class, args);

        Package2 package2 = context.getBean(Package2.class);
        System.out.println("package2 = " + package2);


        Package1 package1 = context.getBean(Package1.class);
        System.out.println("package1 = " + package1);

        // 执行结果 package1对象扫描到了，package2没有扫描到
        // package2 = com.itxiaoer.package2.Package2@305a0c5f
        //  No qualifying bean of type 'com.itxiaoer.package1.Package1' available

    }
}
