package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Address;
import com.turkcell.spring.starter.repositories.abstracts.AddressRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressRepositoryImpl implements AddressRepository {
    private List<Address> addressList = new ArrayList<>();
    public AddressRepositoryImpl(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public void add(Address address) {
        addressList.add(address);
    }

    @Override
    public void delete(Address address) {
        addressList.remove(address);
    }

    @Override
    public void update(Address addressOld, Address addressNew) {
        addressOld = addressNew;
    }
}
