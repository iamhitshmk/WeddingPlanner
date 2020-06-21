package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.weddingplanner.utils.TextValidation;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JoinWeddingActivity extends AppCompatActivity {

    @BindView(R.id.etEnterCode)
    EditText etEnterCode;

    @BindView(R.id.btnSubmit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_wedding);
        ButterKnife.bind(this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strCode = etEnterCode.getText().toString();
                if (TextValidation.validateText(strCode)){
                    Toast.makeText(JoinWeddingActivity.this,"Joined successfully",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(JoinWeddingActivity.this,"Invalid code",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}