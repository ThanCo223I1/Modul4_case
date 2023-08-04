package com.example.manageraccount.dao;

import com.example.manageraccount.model.Account;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Component
@Transactional
public class AccountDao {
    @PersistenceContext
    EntityManager entityManager;

    public List<Account> getAll(){
        String queryStr = "SELECT a FROM Account a";
        TypedQuery<Account> query = entityManager.createQuery(queryStr, Account.class);
        return query.getResultList();
    }

    public Account findById(int id){
        String queryStr = "SELECT a FROM Account a where a.id = :id";
        TypedQuery<Account> query = entityManager.createQuery(queryStr, Account.class).setParameter("id", id);
        return  query.getSingleResult();
    }

    public void save(Account account){
        entityManager.persist(account);
    }

    public void edit(Account account){
        entityManager.merge(account);
    }

    public void delete(int id){
        Account account = findById(id);
        entityManager.remove(account);
    }

}
