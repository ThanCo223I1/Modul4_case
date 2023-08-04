package com.example.demowebservice.repositpry;

import com.example.demowebservice.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository <Product,Integer> {
}
