package com.ps.rest.crud.helloworld.service;

import com.ps.rest.crud.helloworld.db.CRUD;
import com.ps.rest.crud.helloworld.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personCRUDImpl")
public class PersonCRUDImplementation implements PersonCRUDRepo<Person> {

    @Autowired
    private CRUD crud;

    @Override
    public List<Person> selectAll() {
        List<Person> personList = crud.selectAll(new Person());
        System.out.println("PersonCRUDImplementation:person list size from DB -> " + personList.size());
        return personList;
    }

    @Override
    public int deleteById() {
        return 0;
    }

    @Override
    public int insert() {
        return 0;
    }

    @Override
    public int updateById() {
        return 0;
    }
}
