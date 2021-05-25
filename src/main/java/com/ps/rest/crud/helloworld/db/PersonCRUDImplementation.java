package com.ps.rest.crud.helloworld.db;

import com.ps.rest.crud.helloworld.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("personCRUDImpl")
public class PersonCRUDImplementation implements CRUD<Person> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> selectAll() {
        String sql = "SELECT * FROM test";
        List<Person> personList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Person.class));
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
