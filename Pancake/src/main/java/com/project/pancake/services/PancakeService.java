package com.project.pancake.services;

import java.util.List;

import com.project.pancake.entities.Pancake;

public interface PancakeService {
	
	List<Pancake> findAll();
    Pancake save(Pancake pancake);
    Pancake update(Pancake pancake);
    void deleteById(long id);
    double pancakePrice(long pancakeId);

}
