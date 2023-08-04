package com.example.thuchanhudqlkhachhang.service;

import com.example.thuchanhudqlkhachhang.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
        customers.add(new Customer("Nam","nam@gmail.com","Ha Noi"));
        customers.add(new Customer("Tuan","tuan@gmail.com","Ha Noi"));
        customers.add(new Customer("Long","long@gmail.com","Ha Noi"));
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void createCustomer(Customer customer){
        customers.add(customer);
    }
    public int findById(int id){
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id){
              return i;
            }
        }
        return -1;
    }
    public void editCustomer(int id, Customer customer){
        int index = findById(id);
        customers.set(index,customer);
    }
}
