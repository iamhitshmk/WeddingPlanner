package com.example.weddingplanner.ui.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.weddingplanner.MainActivity;
import com.example.weddingplanner.R;
import com.example.weddingplanner.database.WeddingPlannerDatabase;

import butterknife.ButterKnife;

public class PlaceOrderSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order_success);
        ButterKnife.bind(this);
        clearDataFromDatabase();

    }

    private void clearDataFromDatabase() {
        WeddingPlannerDatabase appDb = WeddingPlannerDatabase.getInstance(this);
        appDb.getWeddingPlannerDao().deleteAll();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goToHomeScreen();
    }

    void goToHomeScreen() {
        Intent homeIntent = new Intent(PlaceOrderSuccess.this, MainActivity.class);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(homeIntent);
    }
}
