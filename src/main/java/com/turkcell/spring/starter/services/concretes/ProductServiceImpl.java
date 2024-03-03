package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.repositories.abstracts.ProductRepository;
import com.turkcell.spring.starter.services.abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product) {
        if(product.getUnitPrice() < 0)
            throw new RuntimeException("Ürün fiyatı 0'dan küçük olamaz.");
        productRepository.add(product);
    }


    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void update(Product productOld, Product productNew) {
        productRepository.update(productOld, productNew);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
