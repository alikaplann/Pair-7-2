package com.turkcell.spring.starter.entities;

public class Address {
    private String country;
    private String city;
    private String PostalCode;
    private String description;
    private String street;
    private int no;

    public Address(String country, String city, String postalCode, String description, String street, int no) {
        this.country = country;
        this.city = city;
        PostalCode = postalCode;
        this.description = description;
        this.street = street;
        this.no = no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }


}
