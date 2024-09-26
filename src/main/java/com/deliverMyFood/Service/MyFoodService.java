package com.deliverMyFood.Service;

import com.deliverMyFood.model.FoodItem;

import java.util.List;

public interface MyFoodService
{
    public List<FoodItem> getMyFoodData();

    public boolean setMyFoodData(List<FoodItem> foodItems);

    public List<FoodItem> getMyFoodItemRange(int startId, int endId);
}
