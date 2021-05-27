package com.ps.rest.crud.helloworld.service;

import java.util.List;

public interface PersonCRUDRepo<T> {
    List<T> selectAll();

    boolean deleteById(int id);

    boolean insert(String name);

    boolean updateById(int id);
}
