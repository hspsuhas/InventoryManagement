package com.microservicesdemo.orderservice.repository;

import com.microservicesdemo.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
