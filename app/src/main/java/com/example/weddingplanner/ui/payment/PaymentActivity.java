package com.example.weddingplanner.ui.payment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.TransactionItem;
import com.example.weddingplanner.utils.TextValidation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaymentActivity extends AppCompatActivity {

    @BindView(R.id.etEnterOTP)
    EditText etEnterOTP;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    ArrayList<PlaceOrderItem> item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ButterKnife.bind(this);
        item = getIntent().getParcelableArrayListExtra("item");
    }

    @OnClick(R.id.btnPay)
    void onPayClicked(){
        String strOTP = etEnterOTP.getText().toString();
        if (TextValidation.validateOTP(strOTP)) {
            hideKeyboard();
            proceedToPaymentActivity();
        } else {
            Toast.makeText(this,"Enter 6 Digit OTP",Toast.LENGTH_SHORT).show();
        }
    }

    void proceedToPaymentActivity(){
        if (item != null){
            progressBar.setVisibility(View.VISIBLE);
            DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
            String orderNumber = provideOrderNumber();
            TransactionItem transactionItem = new TransactionItem(orderNumber,item);
            mDatabase.child("add_order").child(orderNumber).setValue(transactionItem)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            progressBar.setVisibility(View.GONE);
                            Intent paymentIntent = new Intent(PaymentActivity.this, PlaceOrderSuccess.class);
                            startActivity(paymentIntent);
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Request failed.", Toast.LENGTH_LONG).show();
                        }
                    });

        }

    }

    private String provideOrderNumber() {
        String randomNumber = new Random().nextInt(Integer.MAX_VALUE) +"";
        return randomNumber;
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }



}
