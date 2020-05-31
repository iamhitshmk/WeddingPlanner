package com.example.weddingplanner.pojo;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "PlaceOrder")
public class PlaceOrderItem {

    public int getId() {
        return id;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @Ignore
    public PlaceOrderItem(String notificationTitle ,String notificationMessage) {
        //this.notificationTitle = notificationTitle;
        //this.notificationMessage = notificationMessage;
    }

    public PlaceOrderItem(int id) {
        this.id = id;
    }
}
