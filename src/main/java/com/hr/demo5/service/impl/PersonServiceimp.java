package com.hr.demo5.service.impl;

import com.hr.demo5.dao.PersonMapper;
import com.hr.demo5.entity.Person;
import com.hr.demo5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonServiceimp implements PersonService {

    @Autowired
    private PersonMapper personMapper;
    public List<Person> findAll() {
        return personMapper.selectAll();
    }
}
