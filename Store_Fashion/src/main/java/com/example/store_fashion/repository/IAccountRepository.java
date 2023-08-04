package com.example.store_fashion.repository;

import com.example.store_fashion.model.Account;
import com.example.store_fashion.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IAccountRepository extends CrudRepository<Account,Integer> {
    @Query(value = "select a from Account a where a.username=:username and a.password=:password")
    Account getAccountLogin(@Param("username") String username, @Param("password") String password);
}
