package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dao.BookDao;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JDBCconfig {
    @Bean
    //获得要获得的bean
    public DataSource dataSorce(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/database?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true");
        ds.setUsername("root");
        ds.setPassword("136601");
        return ds;
    }
}
