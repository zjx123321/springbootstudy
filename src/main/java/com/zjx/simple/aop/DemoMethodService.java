package com.zjx.simple.aop;

import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/7/14.
 */
@Service
public class DemoMethodService {

    public void add() {
        System.out.println("方法规则式测试新增");
    }

}
