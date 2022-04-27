package com.project.pancake.entities;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private Set<Pancake> pancakes;

    private String description;


    private LocalDateTime dateTime;

}
