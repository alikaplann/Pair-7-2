package com.turkcell.spring.starter.services.abstracts;

import com.turkcell.spring.starter.entities.Order;

import java.util.ArrayList;

public interface OrderService {
    public void add(Order order);
    public void delete(Order order);
    public void update(Order orderOld, Order orderNew);

    ArrayList<Order> getall();
}
