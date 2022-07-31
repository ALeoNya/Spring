package com.dao;

import com.pojo.Employe;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface EmployeDao {
    @Select("select * from employe")
    /*
    * @Results用来实现结果集封装
    * */
    @Results(value = {
            @Result(id = true,column = "eid",property = "eid"),
            @Result(column = "name",property = "name"),
            @Result(column = "password",property = "password"),
            @Result(column = "superuser",property = "superuser"),
            @Result(column = "flag",property = "flag"),
            @Result(property = "payrolls",column = "eid",many = @Many(select = "com.dao.PayrollDao.findPayrollBy_eid",fetchType = FetchType.LAZY))

    })
    List<Employe> findAll();

    @Select("select * from employe where eid = #{eid}")
    Employe findEmployeBy_eid(String eid);

    @Select("select * from employe where name = #{name}")
    Employe findEmployeBy_name(String name);

}
