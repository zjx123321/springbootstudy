package com.zjx.simple.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2017/7/14.
 */
public class TaskTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService service = context.getBean(AsyncTaskService.class);

        for(int i=0; i< 10; i++) {
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }

        context.close();
    }

}
