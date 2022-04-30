package com.project.pancake.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.pancake.entities.Order;
import com.project.pancake.repositories.OrderRepository;
import com.project.pancake.services.OrderService;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
    private OrderRepository orderRepository;

    @Override
    public Optional<Order> findById(long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

}
