package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Customer;
import com.turkcell.spring.starter.repositories.abstracts.CustomerRepository;
import com.turkcell.spring.starter.services.abstracts.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository){this.customerRepository = customerRepository; }
    @Override
    public void add(Customer customer) {
        if(!Objects.equals(customer.getAddress(), "İstanbul")) {
            throw new RuntimeException("İstanbul dışına hizmet veremiyoruz!");
        }
        if(getAll().contains(customer)){
            throw new RuntimeException("Bu kullanıcı mevcut!");
        }
        customerRepository.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        if(!getAll().contains(customer)){
            throw new RuntimeException("Bu kullanıcı mevcut değil!");
        }
        customerRepository.delete(customer);
    }

    @Override
    public void update(Customer customerOld, Customer customerNew) {
        if(!getAll().contains(customerOld)){
            throw new RuntimeException("Olmayan kullanıcıyı değiştirmeye çalışıyorsunuz");
        }
        if(!Objects.equals(customerOld.getAddress(), "İstanbul")) {
            throw new RuntimeException("İstanbul dışına hizmet veremiyoruz!");
        }
        customerRepository.update(customerOld,customerNew);
    }


    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
}
