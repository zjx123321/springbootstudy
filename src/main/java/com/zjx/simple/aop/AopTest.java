package com.zjx.simple.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dell on 2017/7/14.
 */
//@ComponentScan   注释掉的为第二种写法
//@SpringBootApplication
public class AopTest {

    public static void main(String[] args) {
//        SpringApplication.run(AopTest.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

//        DemoAnnotationService demoAnnotationService = ApplicationContextUtil.getContext().getBean(DemoAnnotationService.class);
//
//        DemoMethodService demoMethodService = ApplicationContextUtil.getContext().getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

    }

}
