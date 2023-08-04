package com.example.demojpa.repository.impl;

import com.example.demojpa.model.Citys;
import com.example.demojpa.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class CityRepositoryImpl implements CityRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Citys> findAll() {
        TypedQuery<Citys> city = entityManager.createQuery("select c from Citys c",Citys.class);
        return city.getResultList();
    }
}
