package com.text;

import com.dao.PayrollDao;
import com.pojo.Payroll;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PayrollDemo {
//    private InputStream in;
//    private SqlSessionFactory factory;
//    private SqlSession session;
    private PayrollDao payrollDao;


//    @Before    //1.0版本使用after和before注解进行事务控制
//    public void init() throws IOException {
//        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        factory = new SqlSessionFactoryBuilder().build(in);
//        session = factory.openSession();
//        payrollDao = session.getMapper(PayrollDao.class);
//    }
//    @After
//    public void destory() throws IOException {
//        session.commit();
//        session.close();
//        in.close();
//    }
//
//    @Test
//    public void findAll2() {
//        List<Payroll> payrolls = payrollDao.findAll();
//        for(Payroll payroll : payrolls) {
//            System.out.println("查询工资表对应员工的信息");
//            System.out.println(payroll.getEmploye());
//            System.out.println(payroll);
//        }
//    }

//    @Test //2.0工具类测试是否能输出connection
//    public void findAll() {
//        SqlSession sqlSession = null;
//        try {
//            sqlSession = Mybatis_utils.openSession();
//            Connection connection = sqlSession.getConnection();
//            System.out.println(connection);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            Mybatis_utils.closeSession(sqlSession);
//        }



    @Test //2.1满血工具类版本
    public void findAll() {
        SqlSession sqlSession = null;
        sqlSession = MybatisUtils.openSession();
        payrollDao = sqlSession.getMapper(PayrollDao.class);


        List<Payroll> payrolls = payrollDao.findAll();
        for (Payroll payroll:payrolls) {
            System.out.println("====查询工资表对对应的员工信息====");
            System.out.println(payroll.getEmploye());
            System.out.println(payroll);

            MybatisUtils.closeSession(sqlSession);
        }




    }
}
