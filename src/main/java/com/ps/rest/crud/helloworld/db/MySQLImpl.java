package com.ps.rest.crud.helloworld.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MySQLImpl")
public class MySQLImpl<T> implements CRUD<T> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<T> selectAll(T object, String tableName) {
        Class<?> objClass = object.getClass();

        String sql = "SELECT * FROM " + tableName;
        List<T> personList = (List<T>) jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(objClass));

        return personList;
    }

    @Override
    public int deleteById(int id, String tableName) {
        String sql = "DELETE FROM " + tableName + " WHERE id=?";
        Object[] params = {id};

        int result = jdbcTemplate.update(sql, params);

        return result;
    }

    @Override
    public int insert(T object, String tableName) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName(tableName);

        BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(object);

        int result = simpleJdbcInsert.execute(beanPropertySqlParameterSource);

        return result;
    }

    @Override
    public int updateById(int id, String name, String tableName) {
        String sql = "UPDATE " + tableName + " SET name=? WHERE id=?";
        Object[] params = {name, id};

        int result = jdbcTemplate.update(sql, params);

        return result;
    }
}
