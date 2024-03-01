package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Product;

import java.util.List;

public interface ProductService
{
    public void add(Product product);
    public void delete(Product product);
    public void update(Product productOld, Product productNew);
    List<Product> getAll();
}
