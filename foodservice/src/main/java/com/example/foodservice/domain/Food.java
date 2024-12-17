package com.example.foodservice.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int food_id;
    private String name;
    private String description;
    private String imageUrl;

    private String videoUrl;
    private int stock;
    private double rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    /*
    @JoinColumn explicitly specifies the foreign key column
    It is placed on the owning side of the relationship.
    It improves clarity and ensures the database column name aligns with your desired naming convention.
    */

    @ManyToMany
    @JoinTable(name = "food_review", joinColumns = @JoinColumn(name = "food_id"), inverseJoinColumns = @JoinColumn(name = "review_id"))
    private List<Review> reviews;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

}
