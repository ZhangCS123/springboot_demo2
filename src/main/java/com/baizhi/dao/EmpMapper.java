package com.baizhi.dao;

import com.baizhi.entity.Emp;

public interface EmpMapper {
    int insert(Emp record);

    int insertSelective(Emp record);
}