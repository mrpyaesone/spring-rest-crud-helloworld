package com.ps.rest.crud.helloworld.service;

import java.util.List;

public interface PersonCRUDRepo<T> {
    List<T> selectAll();
    int deleteById();
    int insert();
    int updateById();
}
