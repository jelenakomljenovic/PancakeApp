package com.project.pancake.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Pancake {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    private Orders order;


    @ManyToMany
    @JoinTable(
            name = "pancake_ingredient",
            joinColumns = @JoinColumn(name = "pancake_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private Set<Ingredient> ingredients = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

}
