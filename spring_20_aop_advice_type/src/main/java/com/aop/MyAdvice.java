package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(int *..*select())")
    private void pt() {
    }

    //带返回值的标准写法
    @Around("pt()")
    public Object aroundselect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice running");
        Object ret = pjp.proceed();
        System.out.println("around after advice running");
        return ret;
    }
}