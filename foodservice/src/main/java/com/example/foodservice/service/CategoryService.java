package com.example.foodservice.service;


import com.example.foodservice.domain.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService  {
    public Category saveCategory(Category newCategory);
}
