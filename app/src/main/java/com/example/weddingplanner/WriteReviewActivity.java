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

public class WriteReviewActivity extends AppCompatActivity {

    @BindView(R.id.etEnterFeedback)
    EditText etEnterFeedback;

    @BindView(R.id.btnSubmit)
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        ButterKnife.bind(this);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strReview = etEnterFeedback.getText().toString();
                if (TextValidation.validateText(strReview)){
                    etEnterFeedback.setText("");
                    Toast.makeText(WriteReviewActivity.this,"Thank you for submitting the review",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(WriteReviewActivity.this,"Write Review",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}