package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Address;
import com.turkcell.spring.starter.services.abstracts.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adress")

public class AdressController {

    // Dependency Injection
    // @Autowired
    private final AddressService addressService;

    public AdressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void add(@RequestBody Address address)
    {
        addressService.add(address);
    }
    @GetMapping
    public List<Address> get() {
        return addressService.getAll();
    }

    @DeleteMapping
    public void delete(@RequestBody Address address) {
        addressService.delete(address);
    }

    @PostMapping
    public void update(Address addressOld, Address addressNew) {
        addressService.update(addressOld, addressNew);
    }

}