package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Product;

import java.util.List;

public interface ProductService
{
    public void add(Product product);
    public void delete(int productId);
    public void update(int productOldId, Product productNew);
    List<Product> getAll();
}
