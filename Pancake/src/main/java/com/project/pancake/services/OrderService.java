package com.project.pancake.services;

import java.util.Optional;

import com.project.pancake.dto.OrderDTO;
import com.project.pancake.entities.Orders;


public interface OrderService {
	
	OrderDTO findById(long id);

    Orders save(Orders order);

}
