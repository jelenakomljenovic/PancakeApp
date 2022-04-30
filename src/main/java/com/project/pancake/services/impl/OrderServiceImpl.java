package com.project.pancake.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pancake.dto.OrderDTO;
import com.project.pancake.dto.PancakeDTO;
import com.project.pancake.entities.Orders;
import com.project.pancake.entities.Pancake;
import com.project.pancake.repositories.IngredientRepository;
import com.project.pancake.repositories.OrderRepository;
import com.project.pancake.repositories.PancakeRepository;
import com.project.pancake.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PancakeRepository pancakeRepository;

    @Override
    public OrderDTO findById(long id) {
        OrderDTO orderDTO = new OrderDTO();
        double totalPrice = 0;
        Orders order = orderRepository.findById(id).get();
        for(Pancake pancake: order.getPancakes()){
            double pancakePrice = pancakeRepository.pancakePrice(pancake.getId());
            PancakeDTO pancakeDTO = new PancakeDTO();
            pancakeDTO.setId(pancake.getId());
            pancakeDTO.setPrice(pancakePrice);

            orderDTO.getPancakes().add(pancakeDTO);
            totalPrice += pancakePrice;
        }
        if(totalPrice >= 50){
            totalPrice = totalPrice*0.90;
        }
        else if(totalPrice >= 20){
            totalPrice = totalPrice*0.95;
        }
        orderDTO.setTotalPrice(totalPrice);
        return orderDTO;

    }

    @Override
    public Orders save(Orders order) {
    	Orders savedOrder =  orderRepository.save(order);

        for(Pancake pancake : order.getPancakes()){
            Pancake pancake1 = pancakeRepository.getById(pancake.getId());
            pancake1.setOrder(savedOrder);
            pancakeRepository.save(pancake1);
        }
        
        return savedOrder;
    }

}
