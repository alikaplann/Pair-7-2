package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Order;

import java.util.ArrayList;
import java.util.List;

public interface OrderService {
    public void add(Order order);
    public void delete(int orderId);
    public void update(int orderOldId, Order orderNew);

    List<Order> getall();
}
