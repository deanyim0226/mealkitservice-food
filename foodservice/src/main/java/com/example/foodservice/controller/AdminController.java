package com.example.foodservice.controller;

import com.example.foodservice.domain.Food;
import com.example.foodservice.model.request.UploadRequest;
import com.example.foodservice.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AdminController {

    @Autowired
    FoodService foodService;

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

}
