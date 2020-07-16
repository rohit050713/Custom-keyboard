package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;

import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivityCrearteAccountBinding;

import java.util.regex.Pattern;

public class CrearteAccount extends AppCompatActivity {

    ActivityCrearteAccountBinding binding;
    private static final Pattern password= Pattern.compile("^[a-zA-Z0-9~!@#$%^&*()_+=-]{6,}$");
    public static final Pattern Phone= Pattern.compile("^(0)?[1-9][0-9]{6,16}$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_crearte_account);

        //email
        binding.etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
              binding.tvEmailStar.setVisibility(View.GONE);
                String email=binding.etEmail.getText().toString().trim();
                if(email.isEmpty()){
                    binding.tvEmailError.setVisibility(View.VISIBLE);
                }
             else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                  binding.tvEmailError.setVisibility(View.VISIBLE);

              }
             else{
                 binding.tvEmailError.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //phone number
        binding.etPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String phone= binding.etPhone.getText().toString().trim();
                if(phone.isEmpty()){
                    binding.tvPhoneError.setVisibility(View.GONE);
                }

                else if(!Phone.matcher(phone).matches()){
                    binding.tvPhoneError.setVisibility(View.VISIBLE);
                }
                else{
                    binding.tvPhoneError.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // password
        binding.etPswrd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               binding.tvPswrdStar.setVisibility(View.GONE);
                String pswrd= binding.etPswrd.getText().toString().trim();
                if(pswrd.isEmpty()){
                    binding.tvPswrdError.setVisibility(View.VISIBLE);
                }
                else if(!password.matcher(pswrd).matches()){
                    binding.tvPswrdError.setVisibility(View.VISIBLE);

                }
                else{
                    binding.tvPswrdError.setVisibility(View.GONE);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        // cnf pswrd
        binding.etCnfpswrd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                 binding.tvCnfpswrdStar.setVisibility(View.GONE);
                 String cnfpswrd= binding.etCnfpswrd.getText().toString().trim();
                 String pswrd= binding.etPswrd.getText().toString().trim();
                 if(cnfpswrd.isEmpty()){
                     binding.tvCnfpswrdError.setVisibility(View.VISIBLE);
                 }
                 else if(!cnfpswrd.equals(pswrd)){
                     binding.tvCnfpswrdError.setVisibility(View.VISIBLE);
                 }
                 else{
                     binding.tvCnfpswrdError.setVisibility(View.GONE);

                 }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //sign in click listener
         binding.signin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(CrearteAccount.this,SignIn.class);
                 startActivity(intent);
                 finish();
             }
         });


    }

    public boolean validateemail(){
        String email=binding.etEmail.getText().toString().trim();
        if(email.isEmpty()){
            binding.tvEmailError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tvEmailError.setVisibility(View.VISIBLE);
            return false;

        }
        else{
            binding.tvEmailError.setVisibility(View.GONE);
            return true;
        }
    }

    public boolean validatephone(){
        String phone= binding.etPhone.getText().toString().trim();
        if(phone.isEmpty()){
            binding.tvPhoneError.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            binding.tvPhoneError.setVisibility(View.GONE);
            return true;
        }
    }

    public boolean validatepswrd(){

        String pswrd= binding.etPswrd.getText().toString().trim();
        if(pswrd.isEmpty()){
            binding.tvPswrdError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!password.matcher(pswrd).matches()){
            binding.tvPswrdError.setVisibility(View.VISIBLE);
            return false;

        }
        else{
            binding.tvPswrdError.setVisibility(View.GONE);
            return true;

        }
    }

    public boolean validatecnfpswrd(){
        String cnfpswrd= binding.etCnfpswrd.getText().toString().trim();
        String pswrd= binding.etPswrd.getText().toString().trim();
        if(cnfpswrd.isEmpty()){
            binding.tvCnfpswrdError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!cnfpswrd.equals(pswrd)){
            binding.tvCnfpswrdError.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            binding.tvCnfpswrdError.setVisibility(View.GONE);
            return true;

        }
    }

    public void create(View view){
        if(!validateemail() | !validatepswrd() | !validatecnfpswrd()){
            return;
        }
        else{
            Intent intent=new Intent(CrearteAccount.this,SignIn.class);
            startActivity(intent);
            finish();
        }
    }


}