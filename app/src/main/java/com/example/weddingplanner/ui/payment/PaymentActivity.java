package com.example.weddingplanner.ui.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.weddingplanner.R;
import com.example.weddingplanner.utils.TextValidation;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaymentActivity extends AppCompatActivity {

    @BindView(R.id.etEnterOTP)
    EditText etEnterOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPay)
    void onPayClicked(){
        String strOTP = etEnterOTP.getText().toString();
        if (TextValidation.validateOTP(strOTP)) {
            hideKeyboard();
        } else {
            Toast.makeText(this,"Enter 6 Digit OTP",Toast.LENGTH_SHORT).show();
        }
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
