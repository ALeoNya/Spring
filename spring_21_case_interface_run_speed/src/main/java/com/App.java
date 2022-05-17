package com;

import com.dao.AccountDao;
import com.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao bookDao = ctx.getBean(AccountDao.class);
        int num = bookDao.select();
        System.out.println(num);
    }
}
