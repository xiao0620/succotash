package com.hr.demo5.dao;

import com.hr.demo5.entity.Person;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    Person selectByPrimaryKey(Integer id);

    List<Person> selectAll();

    int updateByPrimaryKey(Person record);
}