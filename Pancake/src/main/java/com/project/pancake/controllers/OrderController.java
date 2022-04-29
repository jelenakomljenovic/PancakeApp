package com.project.pancake.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.pancake.dto.OrderDTO;
import com.project.pancake.entities.Orders;
import com.project.pancake.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public OrderDTO getOneOrder(@PathVariable long id){
        return orderService.findById(id);
    }

    @PostMapping
    public Orders postOrder(@RequestBody Orders order){
        return orderService.save(order);
    }

}
