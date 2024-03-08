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
    public void delete(int orderId) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getId() == orderId) {
                orderList.remove(i);
                break;
            }
        }
    }
    @Override
    public void update(int orderOldId, Order orderNew) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getId() == orderOldId) {
                orderList.set(i, orderNew);
                break;
            }
        }
    }
    @Override
    public List<Order> getAll() {
        return orderList;
    }
}
