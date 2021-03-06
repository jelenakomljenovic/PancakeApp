package com.project.pancake.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pancake.entities.Ingredient;
import com.project.pancake.services.ReportService;

@RestController
@RequestMapping("/report")
public class ReportController {
	@Autowired
    private ReportService reportService;

    @GetMapping("/popularIngredient")
    public Ingredient getPopularIngredient(){
        return reportService.getMostPopularIngredient();

    }

    @GetMapping("/popularHealthyIngredient")
    public Ingredient getPopularHealthyIngredient(){
        return reportService.gestMostPopularHealthyIngredient();
    }
}