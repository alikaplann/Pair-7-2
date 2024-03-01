package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Address;

import java.util.List;
public interface AddressService {
    void add(Address address);
    void delete(Address address);
    void update(Address addressOld, Address addressNew);
    List<Address> getAll();
}
