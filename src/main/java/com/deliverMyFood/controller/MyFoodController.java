package com.deliverMyFood.controller;


import com.deliverMyFood.Service.MyFoodService;
import com.deliverMyFood.model.FoodItem;
import com.deliverMyFood.model.InputRequestMyFood;
import com.deliverMyFood.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyFoodController
{
    @Autowired
    MyFoodService myFoodService;

//    @PostMapping("/postMyFood")
//    public String setMyFood(@RequestBody InputRequestMyFood inputRequestMyFood)
//    {
//        return myFoodService.setMyFoodData(inputRequestMyFood.getFoodItems());
//    }

    @GetMapping("/getMyFood")
    public List<FoodItem> getMyFood()
    {
        return myFoodService.getMyFoodData();
    }

    @GetMapping("/range/{startId}/{endId}")
    public List<FoodItem> getMyFoodInRange(@PathVariable ("startId") int startId, @PathVariable ("endId") int endId)
    {
        return myFoodService.getMyFoodItemRange(startId,endId);
    }

    @GetMapping("/foodItemService/{key}")
    public Response responceApi(@PathVariable("key") String key, @RequestBody InputRequestMyFood inputRequestMyFood){
        Response response = new Response();

        if (key.equalsIgnoreCase("set"))
        {
           boolean res = myFoodService.setMyFoodData(inputRequestMyFood.getFoodItems());
           if(res==true){
                response.setStatus("Item saved successfully.");
                response.setStatusCode("200");
           }else{
               response.setStatus("Item not saved.");
               response.setStatusCode("500");
           }
        }
        else if (key.equalsIgnoreCase("get"))
        {
            List<FoodItem> foodItem = myFoodService.getMyFoodData();
            if(foodItem!=null){
                response.setStatus("Item received successfully.");
                response.setStatusCode("200");
                response.setFoodItem(foodItem);
            }else{
                response.setStatus("Item not received.");
                response.setStatusCode("500");
            }
        }

        return response;
    }
}
