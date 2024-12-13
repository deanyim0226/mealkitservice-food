package com.example.foodservice.service;

import com.example.foodservice.domain.Food;
import com.example.foodservice.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {

    public Food saveFood(Food newFood);
    public Food findByName(String foodName);

    public List<Food> findByCategory(String categoryName);


}
