package com.example.foodordering.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodordering.model.MealType;

@Repository
public interface MealTypeRepository extends JpaRepository<MealType, Long> {

}
