package com.demofashion.service;

import com.demofashion.model.Bill;
import com.demofashion.model.BillDetails;
import com.demofashion.model.Product;
import com.demofashion.repository.IBillDetailRepository;
import com.demofashion.repository.IBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Service
public class BillDetailsService implements ICrudService<BillDetails>  {
    @Autowired
    IBillDetailRepository iBillDetailRepository;
    @Override
    public List<BillDetails> getAll() {
        return (List<BillDetails>) iBillDetailRepository.findAll();
    }

    @Override
    public void save(BillDetails billDetails) {
        iBillDetailRepository.save(billDetails);
    }

    @Override
    public void edit(BillDetails billDetails) {
        iBillDetailRepository.save(billDetails);
    }

    @Override
    public void delete(int id) {
        iBillDetailRepository.deleteById(id);
    }
}
