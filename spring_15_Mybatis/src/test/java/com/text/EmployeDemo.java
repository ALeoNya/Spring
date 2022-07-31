package com.text;

import com.dao.EmployeDao;
import com.pojo.Employe;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EmployeDemo {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private EmployeDao employeDao;


    @Before
    public void init() throws IOException {
        in =Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        employeDao = session.getMapper(EmployeDao.class);
    }
    @After
    public void destory() throws IOException {
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void findAll() {
        List<Employe> employes = employeDao.findAll();
        for (Employe employe:employes) {
            System.out.println("====查询每个职员对应的工资====");
            System.out.println(employe.getPayrolls());
            System.out.println(employe);
        }
    }

//    @Test
//    public void findAll() {
//        List<Payroll> payroll = .findAll();
//        for (Payroll employe:employes) {
//            System.out.println(employe);
//        }
//    }

    @Test
    public void findEmployeBy_eid() {
        Employe employe = employeDao.findEmployeBy_eid("e00");
        System.out.println(employe.toString());
    }

    @Test
    public void findEmployeBy_name() {
        Employe employe = employeDao.findEmployeBy_name("hiiro");
        System.out.println(employe.toString());
    }


}
