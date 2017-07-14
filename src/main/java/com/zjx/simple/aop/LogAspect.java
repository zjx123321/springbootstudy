package com.zjx.simple.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by dell on 2017/7/14.
 */
@Aspect  //通过该注解声明一个切面
@Component  //让此切面成为spring容器管理的bean
public class LogAspect {

    @Pointcut("@annotation(com.zjx.simple.aop.Action)")  //声明切点
    public void annotationPointCut(){
        System.out.println("action 切点");
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println(action.name());
    }

    @Before("execution(* com.zjx.simple.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.getName());
    }

    @Around("annotationPointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            proceedingJoinPoint.proceed();
        }catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

}
