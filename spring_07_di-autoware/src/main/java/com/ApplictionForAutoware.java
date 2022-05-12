package com;

import com.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplictionForAutoware {
    public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");//（1）获取ioc容器：创建容器将ioc初始化bean加载配置
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
