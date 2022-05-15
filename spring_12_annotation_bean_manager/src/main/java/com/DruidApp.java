package com;

import com.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class DruidApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSouce = ctx.getBean(DataSource.class);
        System.out.println(dataSouce);
    }
}
