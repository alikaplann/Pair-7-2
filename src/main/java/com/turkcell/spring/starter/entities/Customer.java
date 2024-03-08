package com.turkcell.spring.starter.entities;

public class Customer extends Person {
    private String address;

    public Customer(int id, String name, String lastName, String number) {
        super(id, name, lastName, number);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
