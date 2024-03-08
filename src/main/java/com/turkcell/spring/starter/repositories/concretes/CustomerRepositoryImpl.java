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
    public void delete(int customerId) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == customerId) {
                customerList.remove(i);
                break;
            }
        }
    }

    @Override
    public void update(int customerOldId, Customer customerNew) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == customerOldId) {
                customerList.set(i, customerNew);
                break;
            }
        }
    }

    @Override
    public List<Customer> getAll() {
        return customerList;
    }


}
