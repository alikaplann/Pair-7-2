package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Order;
import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.services.abstracts.OrderService;
import com.turkcell.spring.starter.services.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    public void add(@RequestBody Order order)
    {
        orderService.add(order);
    }
    @GetMapping("/get")
    public List<Order> get() {
        return orderService.getall();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int orderId)
    {
        orderService.delete(orderId);
    }
    @PutMapping("/update")
    public void update(@RequestParam int orderOldId,@RequestBody Order orderNew) {
        orderService.update(orderOldId, orderNew);
    }
}
