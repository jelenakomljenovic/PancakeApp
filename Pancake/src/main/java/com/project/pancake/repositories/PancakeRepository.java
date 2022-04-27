package com.project.pancake.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pancake.entities.Pancake;

public interface PancakeRepository extends JpaRepository<Pancake, Long> {

}
