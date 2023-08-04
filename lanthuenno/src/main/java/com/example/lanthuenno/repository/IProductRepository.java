package com.example.lanthuenno.repository;

import com.example.lanthuenno.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
}
