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
    public void delete(int customerId) {
        if(Contains(customerId)){
            throw new RuntimeException("Bu kullanıcı mevcut değil!");
        }
        customerRepository.delete(customerId);
    }

    @Override
    public void update(int customerOldId, Customer customerNew) {
        if(!Contains(customerOldId)){
            throw new RuntimeException("Olmayan kullanıcıyı değiştirmeye çalışıyorsunuz");
        }
        if(!Objects.equals(customerNew.getAddress(), "İstanbul")) {
            throw new RuntimeException("İstanbul dışına hizmet veremiyoruz!");
        }
        customerRepository.update(customerOldId,customerNew);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    boolean Contains(int customerId){
        for (int i = 0; i < getAll().size(); i++) {
            if (getAll().get(i).getId() == customerId) {
                return true;
            }
        }
        return false;
    }
}
