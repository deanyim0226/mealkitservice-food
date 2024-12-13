package com.example.foodservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {


    /*
    write a review upon purchase
     */

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){

        return null;
    }
}
