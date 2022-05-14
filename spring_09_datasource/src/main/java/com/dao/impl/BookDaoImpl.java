package com.dao.impl;

import com.dao.BookDao;

import java.util.*;


public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    public void save() {
        System.out.println("book dap save....."+ name);


    }
}
