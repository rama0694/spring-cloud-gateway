package com.microservice.os.api.controller;

import com.microservice.os.api.entity.Order;
import com.microservice.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/book-order")
    public Order bookOrder(@RequestBody Order order){
        return service.saveOrder(order);
    }

    @GetMapping("/get-order")
    public String getOrder(){
        return "Works";
    }
}
