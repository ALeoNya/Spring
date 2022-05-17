package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.dao.BookDao.findName(..))")
    private void pt() {
    }

    @Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice running");
    }

//    @Around("pt()")
    public Object aroundselect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice running");
        Object ret = pjp.proceed();
        System.out.println("around after advice running");
        return ret;
    }
}