package com.microservicesdemo.orderservice.controller;

import com.microservicesdemo.orderservice.dto.OrderRequest;
import com.microservicesdemo.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println(orderRequest);
        orderService.placeOrder(orderRequest);
       return "Order placed successfully";
    }
}
