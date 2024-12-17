package com.example.foodservice.controller;

import com.example.foodservice.domain.Category;
import com.example.foodservice.domain.Food;
import com.example.foodservice.model.request.UploadRequest;
import com.example.foodservice.service.CategoryService;
import com.example.foodservice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    FoodService foodService;

    @Autowired
    CategoryService categoryService;

    @PostMapping("/createFood")
    public ResponseEntity<?> createFood(@RequestBody UploadRequest request, @RequestParam("file")MultipartFile image){

        if(image.isEmpty()){
            return ResponseEntity.status(404).body(null);
        }

        String imageUrl = "";
        //Save Image file into S3 and extract imageUrl from S3

        Food newFood = new Food();
        newFood.setName(request.getName());
        newFood.setDescription(request.getDescription());
        newFood.setStock(request.getStock());
        newFood.setImageUrl(imageUrl);

        newFood = foodService.saveFood(newFood);

        return ResponseEntity.status(200).body(newFood);
    }

    @PutMapping("/updateFood")
    public ResponseEntity<?> updateFood(){


        return null;
    }

    @DeleteMapping("/deleteFood")
    public ResponseEntity<?> deleteFood(){
        return null;
    }

    @PostMapping("/createCategory")
    public ResponseEntity<?> createCategory(@RequestBody UploadRequest request, @RequestParam("file")MultipartFile image){

        if(image.isEmpty()){
            return ResponseEntity.status(404).body(null);
        }

        String imageUrl = "";
        //Save Image file into S3 and extract imageUrl from S3

        Category newCategory = new Category();
        newCategory.setName(request.getName());
        newCategory.setImage(imageUrl);

        newCategory = categoryService.saveCategory(newCategory);

        return ResponseEntity.status(200).body(newCategory);
    }

    @PutMapping("/updateCategory")
    public ResponseEntity<?> updateCategory(){


        return null;
    }

    @DeleteMapping("/deleteCategory")
    public ResponseEntity<?> deleteCategory(){
        return null;
    }

}
