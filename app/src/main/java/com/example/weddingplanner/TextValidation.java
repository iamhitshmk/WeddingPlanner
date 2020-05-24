package com.example.weddingplanner;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextValidation {

    public static boolean validateName(String name){
        String regex = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()) {
            return true;
        }
        return false;

    }

    public static boolean validateEmail(String emailId) {
        boolean flag = android.util.Patterns.EMAIL_ADDRESS.matcher(emailId).matches();
        if (flag) {
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String password) {
        if (TextUtils.isEmpty(password) ||  password.length() < 8) {

            return false;
        } else {
            return true;
        }
    }



    public static boolean validateMobileNumber(String mobileNumber) {

        if (mobileNumber.equals("")) {
            return false;
        } else if (mobileNumber.length() != 10) {
            return false;
        } else
            return true;
    }




}
