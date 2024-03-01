package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Order;

public interface OrderRepository {
    void add(Order order);
    void delete(Order order);
    void update(Order orderOld, Order orderNew);
}
