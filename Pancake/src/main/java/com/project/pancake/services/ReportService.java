package com.project.pancake.services;

import com.project.pancake.entities.Ingredient;

public interface ReportService {
	
	Ingredient getMostPopularIngredient();
    Ingredient gestMostPopularHealthyIngredient();
	
}
