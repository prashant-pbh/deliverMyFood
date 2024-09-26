package com.deliverMyFood.model;

// we will use generic class here

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodItem
{
    @Id
    private int id;
    private int calorie;
    private String foodName;

    public FoodItem(){}

    public FoodItem(int id, int calorie, String foodName)
    {
        this.foodName = foodName;
        this.calorie = calorie;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "id=" + id +
                ", calorie=" + calorie +
                ", foodName='" + foodName + '\'' +
                '}';
    }
}
