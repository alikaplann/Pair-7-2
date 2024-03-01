package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Address;
import com.turkcell.spring.starter.repositories.abstracts.AddressRepository;
import com.turkcell.spring.starter.services.abstracts.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public void add(Address address) {

        addressRepository.add(address);
    }

    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }

    @Override
    public void update(Address addressOld, Address addressNew) {

    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
