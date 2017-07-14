package com.zjx.simple.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/7/14.
 */
@Service  //执行任务的类
public class AsyncTaskService {

    @Async //表示该方法是个异步方法  如果注明在类上，则这个类的所有方法都是异步的
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }

}
