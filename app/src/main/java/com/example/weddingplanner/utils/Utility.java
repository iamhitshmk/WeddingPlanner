package com.example.weddingplanner.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class Utility {

    private static final String MY_PREFS_NAME = "WeddingPlannerPref";

    public static void setIsLoggedIn(Context context , boolean loggedIn){
        SharedPreferences.Editor editor = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean("loggedIn",loggedIn);
        editor.apply();
    }

    public static boolean getIsLoggedIn(Context context){
        SharedPreferences prefs = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getBoolean("loggedIn", false);
    }

}
