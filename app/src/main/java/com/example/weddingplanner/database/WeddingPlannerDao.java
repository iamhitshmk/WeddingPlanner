package com.example.weddingplanner.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.weddingplanner.pojo.PlaceOrderItem;

import java.util.List;


@Dao
public interface WeddingPlannerDao {

    @Query("Select * from PlaceOrder")
    List<PlaceOrderItem> getItems();

    @Insert
    void insertItem(PlaceOrderItem placeOrderItem);

    @Query("DELETE FROM PlaceOrder")
    public void deleteAll();
}
