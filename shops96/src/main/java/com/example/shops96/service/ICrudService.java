package com.example.shops96.service;

import com.example.shops96.model.Account;

import java.util.List;

public interface ICrudService <E>{
    List<E> getAll();
    void save(E e);
    void edit(E e);
    void  delete(int id);

}

