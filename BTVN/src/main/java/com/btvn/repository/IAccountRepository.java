package com.btvn.repository;

import com.btvn.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IAccountRepository extends CrudRepository<Account , Integer> {
    @Query(value = "select a from Account a where a.username=:username and a.password=:password")
    Account getAccountLogin(@Param("username") String username, @Param("password") String password);
     Account findAccountByUsername(String username);
}
