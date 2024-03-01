package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Address;

public interface AddressRepository {
    void add(Address address);
    void delete(Address address);
    void update(Address addressOld, Address addressNew);
}
