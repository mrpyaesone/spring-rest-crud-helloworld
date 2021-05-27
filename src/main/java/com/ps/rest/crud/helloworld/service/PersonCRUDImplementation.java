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
        List<Person> personList = crud.selectAll(new Person(), "test");
        System.out.println("PersonCRUDImplementation:person list size from DB -> " + personList.size());
        return personList;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean insert(String name) {
        int result = crud.insert(new Person(name), "test");

        if (result > 0) {
            return true;
        }

        return false;
    }

    @Override
    public boolean updateById(int id) {
        return false;
    }
}
