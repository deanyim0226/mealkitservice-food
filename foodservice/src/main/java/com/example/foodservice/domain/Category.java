package com.example.foodservice.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;
    private String name;
    private String image;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Food> foods;
    /*
    The mappedBy = "category" in Category tells JPA that the relationship is owned by the category field in the Food entity.
    JPA does not create an additional foreign key column for the foods field in the Category table.
     */

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
