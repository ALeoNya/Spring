package com.text;


import com.dao.EmployeDao;
import com.pojo.Employe;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//基于注解的mybatis使用
public class MybatisDemo {
//    public static void main(String[] args) throws IOException {
//
//    }
    @Test
    public void Employe_Text() throws IOException {
        //1。获取字节输入流
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.根据字节输入流构建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.根据SqlSessionFactory生成一个SqlSession
        SqlSession session = factory.openSession();
        //4.使用SqlSession获取Dao的代理对象
        EmployeDao employeDao = session.getMapper(EmployeDao.class);
        //5.执行dao方法
        List<Employe> Employes = employeDao.findAll();
        for(Employe employe : Employes) {
            System.out.println(employe);
        }
        //6.释放资源
        session.close();
        in.close();
    }
}
