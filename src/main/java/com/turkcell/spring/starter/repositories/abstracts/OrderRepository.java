package com.turkcell.spring.starter.repositories.abstracts;

import com.turkcell.spring.starter.entities.Order;

import java.util.ArrayList;
import java.util.List;

public interface OrderRepository {
    void add(Order order);
    void delete(int orderId);
    void update(int orderOldId, Order orderNew);

    List<Order> getAll();
}
