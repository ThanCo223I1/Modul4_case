package com.demofashion.repository;

import com.demofashion.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface IBillRepository extends CrudRepository<Bill, Integer> {
}
