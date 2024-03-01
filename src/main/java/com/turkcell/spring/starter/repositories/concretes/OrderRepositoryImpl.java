package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Order;
import com.turkcell.spring.starter.repositories.abstracts.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private List<Order> orderList = new ArrayList<Order>();

    @Override
    public void add(Order order) {
        orderList.add(order);
    }

    @Override
    public void delete(Order order) {
        orderList.remove(order);
    }

    @Override
    public void update(Order orderOld, Order orderNew) {
        orderOld=orderNew;
    }
}
