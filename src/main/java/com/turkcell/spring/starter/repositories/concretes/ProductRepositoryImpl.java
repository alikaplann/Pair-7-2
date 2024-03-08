package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository
{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int productId) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == productId) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public void update(int productOldId, Product productNew) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == productOldId) {
                productList.set(i, productNew);
                break;
            }
        }
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}
// 5 adet ana entity
// gerekli crud işlemleri

// bireysel : Spring IoC , Medium

// 9:00