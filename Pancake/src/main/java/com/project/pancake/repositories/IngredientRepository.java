package com.project.pancake.repositories;

import com.project.pancake.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IngredientRepository extends JpaRepository<Ingredient, Long>{
	
	@Query("select distinct i from Ingredient i join i.pancakes c group by i.id order by count(i.id) DESC")
    Ingredient getMostPopularIngredient();

    @Query("select distinct i from Ingredient i join i.pancakes c where i.healthy=true group by i.id order by count(i.id) DESC ")
    Ingredient getMostPopularHealthyIngredient();
	

}
