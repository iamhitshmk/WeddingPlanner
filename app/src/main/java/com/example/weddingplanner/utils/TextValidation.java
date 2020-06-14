package com.example.weddingplanner.utils;

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

    public static boolean validateCardNumber(String strCardNumber) {
        if (TextUtils.isEmpty(strCardNumber) || strCardNumber.length() < 16 || !strCardNumber.equals("1234-5678-1234-5678")) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean validateCVVNumber(String strCvvNumber) {
        if (TextUtils.isEmpty(strCvvNumber) || strCvvNumber.length() < 3 || !strCvvNumber.equals("123")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateExpiryDate(String strExpiryDate) {
        if (TextUtils.isEmpty(strExpiryDate) || strExpiryDate.length() < 4 || !strExpiryDate.replaceAll("/","").equals("1234")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateOTP(String strOtp) {
        if (TextUtils.isEmpty(strOtp) || strOtp.length() < 6 || !strOtp.equals("123456")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean validateText(String inputValue) {
        if (TextUtils.isEmpty(inputValue)) {
            return false;
        } else {
            return true;
        }
    }






}
