package com.dao.impl;

import com.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
//@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private  String name;

    public void save() {
        System.out.println("book dao save....." + name);
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }
}
