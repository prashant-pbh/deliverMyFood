package com.deliverMyFood.model;

import java.util.List;

public class Response {
    private String status;
    private String statusCode;
    private List<FoodItem> foodItem;

    public Response() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public List<FoodItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(List<FoodItem> foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", foodItem=" + foodItem +
                '}';
    }
}
