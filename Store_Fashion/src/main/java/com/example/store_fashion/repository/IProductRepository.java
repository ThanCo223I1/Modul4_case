package com.example.store_fashion.repository;

import com.example.store_fashion.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
}
