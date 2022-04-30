package com.project.pancake.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.pancake.entities.Pancake;
import com.project.pancake.services.PancakeService;

@RestController
@RequestMapping("/pancakes")
public class PancakeController {

	 @Autowired
	 private PancakeService pancakeService;
	 
	 @GetMapping
	 public List<Pancake> getPancakes(){
		 return pancakeService.findAll();
	 }

	 @PostMapping
	 public Pancake postPancake(@RequestBody Pancake pancake){
		 return pancakeService.save(pancake);
	 }

	 @PutMapping("{id}")
	 public Pancake putPancake(@PathVariable long id, @RequestBody Pancake pancake){
		 pancake.setId(id);
		 return pancakeService.save(pancake);
	 }

	 @DeleteMapping("{id}")
	 public ResponseEntity deletePancake(@PathVariable long id){
		 pancakeService.deleteById(id);
		 return new ResponseEntity(HttpStatus.OK);
	 }
}
