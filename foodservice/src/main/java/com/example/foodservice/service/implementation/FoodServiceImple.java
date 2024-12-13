package com.example.foodservice.service.implementation;

import com.example.foodservice.domain.Food;
import com.example.foodservice.repository.FoodRepository;
import com.example.foodservice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FoodServiceImple implements FoodService {

    @Autowired
    FoodRepository foodRepository;

    @Override
    public Food saveFood(Food newFood) {

        return null;
    }

    @Override
    public Food findByName(String foodName) {
        return null;
    }

    @Override
    public List<Food> findByCategory(String categoryName) {
        return null;
    }
}
