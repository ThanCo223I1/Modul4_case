package com.demofashion.service;

import com.demofashion.model.Bill;
import com.demofashion.model.Product;
import com.demofashion.repository.IBillRepository;
import com.demofashion.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements ICrudService<Bill>  {

    @Autowired
    IBillRepository iBillRepository;

    @Override
    public List<Bill> getAll() {
        return (List<Bill>) iBillRepository.findAll();
    }

    @Override
    public void save(Bill bill) {
        iBillRepository.save(bill);
    }

    @Override
    public void edit(Bill bill) {
        iBillRepository.save(bill);
    }

    @Override
    public void delete(int id) {
        iBillRepository.deleteById(id);
    }
}
