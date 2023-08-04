package com.demofashion.repository;

import com.demofashion.model.BillDetails;
import org.springframework.data.repository.CrudRepository;

public interface IBillDetailRepository extends CrudRepository<BillDetails,Integer> {
}
