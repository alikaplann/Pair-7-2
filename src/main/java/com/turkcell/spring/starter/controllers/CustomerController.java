package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Address;
import com.turkcell.spring.starter.entities.Customer;
import com.turkcell.spring.starter.services.abstracts.AddressService;
import com.turkcell.spring.starter.services.abstracts.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@RequestMapping("/api/customer")

public class CustomerController {

    // Dependency Injection
    // @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void add(@RequestBody Customer customer)
    {
        customerService.add(customer);
    }
    @GetMapping
    public List<Customer> get() {
        return customerService.getAll();
    }

    @DeleteMapping
    public void delete(@RequestBody Customer customer) {
        customerService.delete(customer);
    }

    @PostMapping
    public void update(Customer customerOld, Customer customerNew) {
        customerService.update(customerOld, customerNew);
    }

}
