package com.zjx.simple.aop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by dell on 2017/7/14.
 */
@Configurable
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {

}
