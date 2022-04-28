package com.project.pancake.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.project.pancake.entities.Ingredient;
import com.project.pancake.services.IngredientService;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
	
	 @Autowired
	 private IngredientService ingredientService;
	 
	 @GetMapping
	 public List<Ingredient> getIngredients(){
        return ingredientService.findAll();
	 }

	 @PostMapping
	 public Ingredient postIngredient(@RequestBody Ingredient ingredient){
		 return ingredientService.save(ingredient);
	 }

	 @PutMapping("{id}")
	 public Ingredient putIngredient(@PathVariable long id, @RequestBody Ingredient ingredient){
		 ingredient.setId(id);
		 return ingredientService.save(ingredient);
	 }

	 @DeleteMapping("{id}")
	 public ResponseEntity deleteIngredient(@PathVariable long id){
		 ingredientService.deleteById(id);
		 return new ResponseEntity(HttpStatus.OK);
	 }
}
