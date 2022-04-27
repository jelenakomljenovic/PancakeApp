package com.project.pancake.entities;

import java.util.Set;

import javax.persistence.*;

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

    @ManyToMany(mappedBy = "ingredients")
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

}
