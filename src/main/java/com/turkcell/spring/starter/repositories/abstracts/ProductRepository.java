package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Product;

import java.util.List;

public interface ProductRepository
{
    void add(Product product);
    void delete(int productId);
    void update(int productOldId, Product productNew);
    List<Product> getAll();
}
