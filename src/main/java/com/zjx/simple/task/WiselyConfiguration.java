package com.zjx.simple.task;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by dell on 2017/7/14.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Configuration
public @interface WiselyConfiguration {

    String[] value() default {};

}
