package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.etName)
    EditText etName;

    @BindView(R.id.etEmail)
    EditText etEmail;

    @BindView(R.id.etMobileNumber)
    EditText etMobileNumber;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @BindView(R.id.etConfirmPassword)
    EditText etConfirmPassword;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnRegister)
    void onRegisterButtonClicked(){
        textValidate();
    }

    private void textValidate() {
        boolean lastFlag = true;
        String strName = etName.getText().toString();
        String strEmail = etEmail.getText().toString();
        String strMobileNumber = etMobileNumber.getText().toString();
        String strPassword = etPassword.getText().toString();
        String strConfirmPassword = etConfirmPassword.getText().toString();

        if (TextValidation.validateName(strName)) {
            if (TextValidation.validateEmail(strEmail)) {
                if (TextValidation.validateMobileNumber(strMobileNumber)) {
                    if (TextValidation.validatePassword(strPassword)) {
                        if (strPassword.equals(strConfirmPassword)) {
                            registerWebService(strName, strEmail, strPassword);
                        }else {
                            Toast.makeText(getApplicationContext(), "Password and Confirm Password should be same", Toast.LENGTH_LONG).show();
                        }
                    }else {
                        Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "Enter Mobile Number", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(getApplicationContext(), "Enter Email Id", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Enter Name", Toast.LENGTH_LONG).show();
        }
    }

    private void registerWebService(final String name, String email, String password) {
        progressBar.setVisibility(View.VISIBLE);
        FirebaseAuth auth = FirebaseAuth.getInstance();
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(RegisterActivity.this, task -> {
                    if (task.isSuccessful()) {
                        final FirebaseUser firebaseUser = task.getResult().getUser();
                        Task<Void> updateTask = firebaseUser.updateProfile(
                                new UserProfileChangeRequest
                                        .Builder()
                                        .setDisplayName(name).build());
                        updateTask.addOnCompleteListener(task1 -> {
                            progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Registration Successfull.", Toast.LENGTH_LONG).show();
                            finish();
                        });

                    } else {
                        progressBar.setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), "Registration failed.", Toast.LENGTH_LONG).show();
                    }
                });
    }
}
