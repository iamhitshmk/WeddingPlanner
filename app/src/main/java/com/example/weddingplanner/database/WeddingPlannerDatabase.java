package com.example.weddingplanner.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.weddingplanner.pojo.PlaceOrderItem;


@Database(entities = PlaceOrderItem.class, exportSchema = false,version = 1)
public abstract class WeddingPlannerDatabase extends RoomDatabase {

    private static WeddingPlannerDatabase instance;
    private static final String DB_NAME = "WeddingPlanner.db";

    public static synchronized WeddingPlannerDatabase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), WeddingPlannerDatabase.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract WeddingPlannerDao getWeddingPlannerDao();
}
