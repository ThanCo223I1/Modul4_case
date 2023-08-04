package com.example.lanthuenno.service;

import java.util.List;

public interface ICrudService <E>{
    List<E> getAll();
    void save(E e);
    void edit(E e);
    void  delete(int id);
}
