package com.ps.rest.crud.helloworld.db;

import java.util.List;

public interface CRUD<T> {
     List<T> selectAll();
     int deleteById();
     int insert();
     int updateById();

}