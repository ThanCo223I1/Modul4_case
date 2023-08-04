package com.demofashion.model;

import javax.persistence.*;

@Entity
public class BillDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Bill bill;

    public BillDetails() {
    }

    public BillDetails(int id, int quantity, Product product, Bill bill) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
