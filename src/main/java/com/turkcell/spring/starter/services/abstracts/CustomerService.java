package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customerOld, Customer customerNew);
    List<Customer> getAll();
}
