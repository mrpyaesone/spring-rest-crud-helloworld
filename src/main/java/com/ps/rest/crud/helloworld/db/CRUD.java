package com.ps.rest.crud.helloworld.db;

import java.util.List;

public interface CRUD<T> {
    List<T> selectAll(T object, String schemaName);

    int deleteById(int id, String tableName);

    int insert(T object, String tableName);

    int updateById(int id, String name, String tableName);

}
