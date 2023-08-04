package com.example.demojpa.repository;

import com.example.demojpa.model.Citys;

import java.util.List;

public interface CityRepository {
    List<Citys> findAll();
}
