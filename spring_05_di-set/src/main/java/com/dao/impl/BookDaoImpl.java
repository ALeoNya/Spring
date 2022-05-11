package com.dao.impl;

import com.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connNum;
    private String dbName;

    public void setConnNum(int connNum) {
        this.connNum = connNum;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void save() {
        System.out.println("book dao save"+connNum+","+dbName);
    }
}
