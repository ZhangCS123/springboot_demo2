package com.baizhi;

import com.baizhi.dao.EmpMapper;
import com.baizhi.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value="com.baizhi.dao")
public class SpringbootDemo2ApplicationTests {
    @Autowired
    EmpMapper empMapper;

    @Test
    public void contextLoads() {
        Emp emp=new Emp();
        emp.setId(5);
        emp.setName("lal");
        emp.setDesc("sdsadasdasd");
        int i=empMapper.insert(emp);
        System.out.println(i);
    }
}
