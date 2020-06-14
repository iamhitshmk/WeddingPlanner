package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weddingplanner.utils.TextValidation;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreateWeddingActivity extends AppCompatActivity {

    @BindView(R.id.etWeddingTitle)
    EditText etWeddingTitle;

    @BindView(R.id.etWeddingLocation)
    EditText etWeddingLocation;

    @BindView(R.id.etWeddingDate)
    EditText etWeddingDate;

    @BindView(R.id.tvBride)
    TextView tvBride;

    @BindView(R.id.tvGroom)
    TextView tvGroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_wedding);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCreateWedding)
    void onCreateWeddingButtonClicked() {
        String strWeddingTitle = etWeddingTitle.getText().toString();
        String strWeddingLocation = etWeddingLocation.getText().toString();
        String strWeddingDate = etWeddingDate.getText().toString();
        if (TextValidation.validateText(strWeddingTitle)) {
            if (TextValidation.validateText(strWeddingLocation)) {
                if (TextValidation.validateText(strWeddingDate)) {
                    Intent intent = new Intent(CreateWeddingActivity.this,ShortlistedVendorActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Enter Wedding Date", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "Enter Wedding Location", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Enter Wedding Title", Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.etWeddingDate)
    void selectDateOfWedding() {
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        String strDay = dayOfMonth + "";
                        int month = monthOfYear + 1;
                        String strMonth = month + "";
                        if (strDay.length() == 1) {
                            strDay = "0" + dayOfMonth;
                        }

                        if (strMonth.length() == 1) {
                            strMonth = "0" + month;
                        }

                        etWeddingDate.setText(strDay + "/" + strMonth + "/" + year);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);

    }

    @OnClick(R.id.tvBride)
    void onBrideClick(){
        tvBride.setBackgroundResource(R.drawable.selected_bg);
        tvBride.setTextColor(getResources().getColor(R.color.colorWhite));
        tvGroom.setBackground(null);
        tvGroom.setTextColor(getResources().getColor(R.color.colorBlack));
    }

    @SuppressLint("ResourceAsColor")
    @OnClick(R.id.tvGroom)
    void onGroomClick(){
        tvGroom.setTextColor(getResources().getColor(R.color.colorWhite));
        tvGroom.setBackgroundResource(R.drawable.selected_bg);
        tvBride.setTextColor(getResources().getColor(R.color.colorBlack));
        tvBride.setBackground(null);
    }
}