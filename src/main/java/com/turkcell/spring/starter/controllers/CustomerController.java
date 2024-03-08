package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Customer;
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

    @PostMapping("/add")
    public void add(@RequestBody Customer customer)
    {
        customerService.add(customer);
    }
    @GetMapping("/get")
    public List<Customer> get() {
        return customerService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int customerId) {
        customerService.delete(customerId);
    }

    @PostMapping("/update")
    public void update(@RequestParam int customerOldId,@RequestBody Customer customerNew) {
        customerService.update(customerOldId, customerNew);
    }

}
