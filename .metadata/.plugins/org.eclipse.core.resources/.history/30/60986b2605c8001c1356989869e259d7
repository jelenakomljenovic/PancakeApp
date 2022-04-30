package com.project.pancake.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.pancake.entities.Ingredient;
import com.project.pancake.repositories.IngredientRepository;
import com.project.pancake.services.IngredientService;

public class IngredientServiceImpl implements IngredientService{
	
	@Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public void deleteById(long id) {
        ingredientRepository.deleteById(id);

    }

}
