package com.zjx.simple.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/7/14.
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(String msg) {
        DemoEvent demoEvent = new DemoEvent(this);
        demoEvent.setMsg(msg);
        applicationContext.publishEvent(demoEvent);
    }

}
