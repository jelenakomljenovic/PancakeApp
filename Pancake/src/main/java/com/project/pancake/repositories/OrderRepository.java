package com.project.pancake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pancake.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
