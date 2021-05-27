package com.ps.rest.crud.helloworld.db;

import java.util.List;

public interface CRUD<T> {
    List<T> selectAll(T object, String schemaName);

    int deleteById();

    int insert(T object, String tableName);

    int updateById();

}
