package com.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("jdbc.properties")
@Import(JDBCconfig.class)
public class SpringConfig {

}
 