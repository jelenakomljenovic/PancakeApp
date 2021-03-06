package com.project.pancake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.pancake.entities.Pancake;

public interface PancakeRepository extends JpaRepository<Pancake, Long> {
	
	@Query("select SUM(i.price) from Ingredient i join i.pancakes c where c.id = :pancakeId")
    double pancakePrice(long pancakeId);
}
