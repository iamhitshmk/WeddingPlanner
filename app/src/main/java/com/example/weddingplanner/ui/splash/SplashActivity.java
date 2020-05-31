package com.example.weddingplanner.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.weddingplanner.MainActivity;
import com.example.weddingplanner.R;
import com.example.weddingplanner.ui.intro.IntroActivity;
import com.example.weddingplanner.utils.Utility;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        boolean isUserLoggedIn = Utility.getIsLoggedIn(this);
        new Handler().postDelayed(() -> {
            Intent intent;
            if (isUserLoggedIn) {
                intent = new Intent(getApplicationContext(), MainActivity.class);
            } else {
                intent = new Intent(getApplicationContext(), IntroActivity.class);
            }
            startActivity(intent);
            finish();
        }, 3000);
    }
}
