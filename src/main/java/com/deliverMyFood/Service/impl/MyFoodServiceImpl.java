package com.deliverMyFood.Service.impl;

import com.deliverMyFood.Service.MyFoodService;
import com.deliverMyFood.model.FoodItem;
import com.deliverMyFood.repository.MyFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyFoodServiceImpl implements MyFoodService
{
//    List<FoodItem> foodItems = new ArrayList<>();

    @Autowired
    MyFoodRepo myFoodRepo;

    @Override
    public List<FoodItem> getMyFoodData()
    {
        return myFoodRepo.findAll();
    }


    @Override
    public boolean setMyFoodData(List<FoodItem> foodItems)
    {
        try{
            //ToDo we will use stream API here
//            List<FoodItem> foodItemsList = foodItems.stream().toList();
            myFoodRepo.saveAll(foodItems);
        }catch(Exception e){
            return false;
        }

        return true;
    }

    @Override
    public List<FoodItem> getMyFoodItemRange(int startId, int endId) {
        return myFoodRepo.findByIdFoodItem(startId,endId);
    }
}
