package com.project.pancake.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pancake.entities.Ingredient;
import com.project.pancake.entities.Pancake;
import com.project.pancake.repositories.IngredientRepository;
import com.project.pancake.repositories.PancakeRepository;
import com.project.pancake.services.PancakeService;

@Service
public class PancakeServiceImpl implements PancakeService {
	
	@Autowired
    private PancakeRepository pancakeRepository;

    @Autowired
    private IngredientRepository ingredientRepository;


    @Override
    public List<Pancake> findAll() {
        return pancakeRepository.findAll();
    }

    @Override
    public Pancake save(Pancake pancake) {
        return pancakeRepository.save(pancake);
    }

    @Override
    public Pancake update(Pancake pancake) {
        return pancakeRepository.save(pancake);
    }

    @Override
    public void deleteById(long id) {
        pancakeRepository.deleteById(id);

    }

    @Override
    public double pancakePrice(long pancakeId) {
        return pancakeRepository.pancakePrice(pancakeId);
    }

}
