package com.project.pancake.entities;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Ingredient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;


    @Column
    private double price;

    @Enumerated
    private Category category;


    @Column
    private boolean healthy;

    @ManyToMany(mappedBy = "ingredients")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Pancake> pancakes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public Set<Pancake> getPancakes() {
        return pancakes;
    }

    public void setPancakes(Set<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

}
