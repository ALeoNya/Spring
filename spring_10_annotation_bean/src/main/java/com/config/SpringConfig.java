package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration//说明这是一个配置类
@ComponentScan(basePackages = "com")
public class SpringConfig {
}
