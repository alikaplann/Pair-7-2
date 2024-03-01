package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Customer;
import com.turkcell.spring.starter.repositories.abstracts.CustomerRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customerList = new ArrayList<>();
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void update(Customer customerOld, Customer customerNew) {
        customerOld = customerNew;
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }


}
