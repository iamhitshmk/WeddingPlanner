package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weddingplanner.ui.login.LoginActivity;
import com.example.weddingplanner.ui.payment.PlaceOrderSuccess;
import com.example.weddingplanner.utils.Utility;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {

    @BindView(R.id.tvLogout)
    TextView tvLogout;

    @BindView(R.id.tvInitials)
    TextView tvInitials;

    @BindView(R.id.tvShare)
    TextView tvShare;

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvEmailAddressValue)
    TextView tvEmailAddressValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        initOnClicks();
        String name = Utility.getName(this);
        String emailId = Utility.getEmailId(this);
        char nameInitials = getInitial(name);
        tvInitials.setText(nameInitials+"");
        tvEmailAddressValue.setText(emailId);
        tvName.setText(name);

    }

    private void initOnClicks(){
        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utility.clearSharedPref(ProfileActivity.this);
                Intent homeIntent = new Intent(ProfileActivity.this, LoginActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(homeIntent);
            }
        });

        tvShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                String shareBody = "Here is the share content body";
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Wedding Planner");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share App"));
            }
        });

    }

    private char getInitial(String name){
        return name.charAt(0);
    }


}