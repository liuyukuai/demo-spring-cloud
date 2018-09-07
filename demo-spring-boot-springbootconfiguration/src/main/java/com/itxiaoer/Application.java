package com.itxiaoer;

import com.itxiaoer.package1.Package1;
import com.itxiaoer.package2.Package2;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : liuyk
 */
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        Package2 package2 = context.getBean(Package2.class);
        System.out.println("package2 = " + package2);


        Package1 package1 = context.getBean(Package1.class);
        System.out.println("package1 = " + package1);

        // 执行结果
//        package2 = com.itxiaoer.package2.Package2@750fe12e
//        package1 = com.itxiaoer.package1.Package1@f8908f6

    }
}
