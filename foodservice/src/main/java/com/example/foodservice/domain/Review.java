package com.example.foodservice.domain;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int user_id;
    private double rating;
    private String content;
    private Instant created_at;

    @ManyToMany(mappedBy = "reviews")
    private List<Food> foods;


}
