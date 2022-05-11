package com.service.impl;

import com.dao.BookDao;
import com.dao.UserDao;
import com.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    //提供对应的setter方法

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao)
    {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save");
        bookDao.save();
        userDao.save();
    }

}
