package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.etEmailId)
    EditText etEmailId;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSubmit)
    void onBtnLoginClicked(){
        String strEmailId = etEmailId.getText().toString();
        String strPassword = etPassword.getText().toString();
        if (TextValidation.validateEmail(strEmailId)){
            if (TextValidation.validatePassword("Enter Password")){
                hideKeyboard();
                loginWebService(strEmailId,strPassword);
            } else {
                Toast.makeText(this,"Enter Password",Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this,"Enter Email Id",Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.btnRegister)
    void onRegisterButtonClicked(){
        Intent registerIntent = new Intent(this,RegisterActivity.class);
        startActivity(registerIntent);
    }

    private void loginWebService(String emailId,String password){
        progressBar.setVisibility(View.VISIBLE);
        FirebaseAuth auth = FirebaseAuth.getInstance();

        auth.signInWithEmailAndPassword(emailId,password)
                .addOnCompleteListener(LoginActivity.this, task -> {
                    if(task.isSuccessful()){
                        final FirebaseUser firebaseUser = task.getResult().getUser();
                        String name = firebaseUser.getDisplayName();
                        progressBar.setVisibility(View.GONE);
                        //Utility.setIsLoggedIn(getApplicationContext(),true);
                        //Utility.setName(getApplicationContext(),name);
                        Toast.makeText(getApplicationContext(),"Login Successfull.", Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();

                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Login failed.",Toast.LENGTH_LONG).show();
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
