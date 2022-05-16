package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component//注册为bean
@Aspect//让spring识别为aop
public class MyAdvice {

    //    @Pointcut("execution(void com.dao.impl.BookDaoImpl.update())")
//    private void pt(){}//和update()方法绑定(绑定切入点与通知关系)
//    @Pointcut("execution(void com.*.*.*.update())")
    @Pointcut("execution(* *..*update())")
    private void pt() {
    }

//    @Before("pt()")//指定通知添加到原始连接点的具体执行位置（before位置）
//    public void before(){
//        System.out.println(System.currentTimeMillis());
//    }


    //    @Before("pt()")
    public void before() {
        System.out.println("after advice running");
    }

    //    @After("pt()")
    public void after() {
        System.out.println("after advice running");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice running");
        pjp.proceed();
        System.out.println("around after advice running");
    }
}

//-----------AOP工作流程--------------------
//1.spring容器启动
//2.读取所有切面配置中的切入点
//3.初始化bean判断bean对应的类中的方法是否匹配到任意切入点
//        创建原始对象的代理对象（pt是uodate的代理）
//4.获取bean调用方法执行完成操作