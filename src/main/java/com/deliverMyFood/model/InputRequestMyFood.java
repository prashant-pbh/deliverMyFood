package com.deliverMyFood.model;

import java.util.ArrayList;
import java.util.List;

public class InputRequestMyFood
{
    List<FoodItem> foodItems;
    String userName;
    int password;

    public InputRequestMyFood(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public InputRequestMyFood() {
    }

    public InputRequestMyFood(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public String toString() {
        return "InputRequestMyFood{" +
                "foodItems=" + foodItems +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
