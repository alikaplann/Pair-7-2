package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Order;
import com.turkcell.spring.starter.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void add(Order order) {

    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void update(Order orderOld, Order orderNew) {

    }

    @Override
    public ArrayList<Order> getall() {
        return new ArrayList<Order>();
    }
}
