package com.example.shops96.repository;

import com.example.shops96.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository <Product,Integer> {
}
