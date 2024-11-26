package com.example.foodordering.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.foodordering.dto.MealDTO;
import com.example.foodordering.model.Meal;



@Service
public interface MealService {
	
	String isValidInput(Meal meal);
	List<MealDTO> findAll();
	String save(Meal meal);
	String delete(Long mealId);
	Meal findOne(Long id);
	String editMeal(Meal meal);
	List<MealDTO> getMealsByMealTypeId(Long id);
	

}
