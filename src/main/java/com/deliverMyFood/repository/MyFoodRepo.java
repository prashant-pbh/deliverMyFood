package com.deliverMyFood.repository;

import com.deliverMyFood.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface MyFoodRepo extends JpaRepository<FoodItem, Integer>
{
    @Query(value = "select * from food_item where id >= :startId AND id <= :endId", nativeQuery = true )
    List<FoodItem> findByIdFoodItem(@Param("startId") int startId , @Param("endId") int endId);

    public List<FoodItem> findAll();
}
