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

    @PostMapping("/addorder")
    public void add(@RequestBody Order order)
    {
        orderService.add(order);
    }
    @GetMapping("/getorder")
    public List<Order> get() {
        return orderService.getall();
    }

    @DeleteMapping("/deleteorder")
    public void delete(@RequestBody Order order)
    {
        orderService.delete(order);
    }
    @PutMapping("/updateorder")
    public void update(@RequestBody Order orderOld, Order orderNew) {
        orderService.update(orderOld, orderNew);
    }
}
