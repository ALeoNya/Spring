package com.dao.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy//启动了@Aspect,告诉spring用注解开发aop
    public class SpringConfig {

}
