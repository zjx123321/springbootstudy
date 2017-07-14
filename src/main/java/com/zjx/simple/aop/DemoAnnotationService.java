package com.zjx.simple.aop;

import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/7/14.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "新增")
    public void add() {
        System.out.println("注解式测试新增");
    }

}
