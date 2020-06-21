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

    public static void setName(Context context , String name){
        SharedPreferences.Editor editor = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE).edit();
        editor.putString("name",name);
        editor.apply();
    }

    public static String getName(Context context){
        SharedPreferences prefs = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString("name", "");
    }

    public static void setEmailId(Context context , String emailId){
        SharedPreferences.Editor editor = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE).edit();
        editor.putString("emailId",emailId);
        editor.apply();
    }

    public static String getEmailId(Context context){
        SharedPreferences prefs = context.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString("emailId", "");
    }

    public static void clearSharedPref(Context context){
        SharedPreferences preferences = context.getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }

}
