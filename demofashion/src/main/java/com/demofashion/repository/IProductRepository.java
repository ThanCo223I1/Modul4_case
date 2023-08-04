package com.demofashion.repository;

import com.demofashion.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Integer> {
//    List<SanPham> findAllByContentContaining(String content);
//    @Query(nativeQuery = true, value = "select * from sanpham  where sanpham.content like concat('%',:content,'%')")
//    List<SanPham> findAllByContent(@Param("content") String content);
}
