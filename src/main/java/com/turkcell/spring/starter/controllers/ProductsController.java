package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.services.abstracts.ProductService;
import com.turkcell.spring.starter.services.concretes.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController
{
    // Dependency Injection
    // @Autowired
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Product product)
    {
        productService.add(product);
    }
    @GetMapping("/get")
    public List<Product> get() {
        return productService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Product product)
    {
        productService.delete(product);
    }
    @PutMapping("/update")
    public void update(@RequestBody Product productOld, Product productNew) {
        productService.update(productOld, productNew);
    }
}