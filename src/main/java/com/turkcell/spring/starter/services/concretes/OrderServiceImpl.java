package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Order;
import com.turkcell.spring.starter.repositories.abstracts.OrderRepository;
import com.turkcell.spring.starter.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    @Override
    public void add(Order order) {
        orderRepository.add(order);
    }

    @Override
    public void delete(int orderId) {
        orderRepository.delete(orderId);
    }

    @Override
    public void update(int orderOldId, Order orderNew) {
        orderRepository.update(orderOldId, orderNew);
    }

    @Override
    public List<Order> getall() {
        return orderRepository.getAll();
    }
}
