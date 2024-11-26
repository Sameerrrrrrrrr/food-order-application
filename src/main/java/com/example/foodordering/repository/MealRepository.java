package com.example.foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodordering.model.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

}
