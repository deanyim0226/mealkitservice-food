package com.example.foodservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {


    /*
    write a review upon purchase
    generate all the foods
     */

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){

        return null;
    }


    @GetMapping("/search")
    public ResponseEntity<?> getFoodByName(){

        return null;
    }
}
