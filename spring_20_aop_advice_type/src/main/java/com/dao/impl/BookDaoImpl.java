package com.dao.impl;

import com.dao.BookDao;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save.....");
    }
    public void update() {
        System.out.println("book dao update");
    }

    public int select( )
    {
        System.out.println("book dao select");
        return 100;
    }

}
