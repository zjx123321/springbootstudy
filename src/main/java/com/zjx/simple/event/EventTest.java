package com.zjx.simple.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2017/7/14.
 */
public class EventTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("你好");
        context.close();
    }

}
