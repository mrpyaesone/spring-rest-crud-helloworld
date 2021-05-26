package com.ps.rest.crud.helloworld.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MySQLImpl")
public class MySQLImpl<T> implements CRUD<T>{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<T> selectAll(T object) {
        Class<?> objClass  = object.getClass();

        String sql = "SELECT * FROM test";
        List<T> personList = (List<T>) jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(objClass));

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
