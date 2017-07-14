package com.zjx.simple.aop;

import java.lang.annotation.*;

/**
 * Created by dell on 2017/7/14.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() default "";
}
