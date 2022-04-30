package com.project.pancake.services;

import java.util.List;

import com.project.pancake.entities.Ingredient;

public interface IngredientService {
	
	List<Ingredient> findAll();
    Ingredient save(Ingredient ingredient);
    Ingredient update(Ingredient ingredient);
    void deleteById(long id);

}
