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
import com.www.customkeyboard.databinding.ActivitySignInBinding;

import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {

    private static final Pattern password= Pattern.compile("^[a-zA-Z0-9~!@#$%^&*()_+=-]{6,}$");

    ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_sign_in);

       //email
       binding.etLoginEmail.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
               binding.tvLoginEmailStar.setVisibility(View.GONE);
               String email=binding.etLoginEmail.getText().toString().trim();
               if(email.isEmpty()){
                   binding.tvLoginEmailError.setVisibility(View.VISIBLE);
               }
               else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                   binding.tvLoginEmailError.setVisibility(View.VISIBLE);

               }
               else{
                   binding.tvLoginEmailError.setVisibility(View.GONE);
               }
           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });

       //password
        binding.etLoginPswrd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.tvLoginPswrdStar.setVisibility(View.GONE);
                String pswrd= binding.etLoginPswrd.getText().toString().trim();
                if(pswrd.isEmpty()){
                    binding.tvLoginPswrdError.setVisibility(View.VISIBLE);
                }
                else if(!password.matcher(pswrd).matches()){
                    binding.tvLoginPswrdError.setVisibility(View.VISIBLE);

                }
                else{
                    binding.tvLoginPswrdError.setVisibility(View.GONE);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //create account click listener
        binding.tvCreateaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn.this,CrearteAccount.class);
                startActivity(intent);
                finish();
            }
        });

        // forgot click listener
        binding.forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn.this,ForgotPassword.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void signin(View view){
        if(!validate_email() | !validate_pswrd()){
            return;
        }
        else{
            Intent intent=new Intent(SignIn.this,Home.class);
            startActivity(intent);
            finish();
        }

    }


    public boolean validate_email(){
        String email=binding.etLoginEmail.getText().toString().trim();
        if(email.isEmpty()){
            binding.tvLoginEmailError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tvLoginEmailError.setVisibility(View.VISIBLE);
            return false;

        }
        else{
            binding.tvLoginEmailError.setVisibility(View.GONE);
            return true;
        }
    }

    public boolean validate_pswrd(){
        String pswrd= binding.etLoginPswrd.getText().toString().trim();
        if(pswrd.isEmpty()){
            binding.tvLoginPswrdError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!password.matcher(pswrd).matches()){
            binding.tvLoginPswrdError.setVisibility(View.VISIBLE);
            return false;

        }
        else{
            binding.tvLoginPswrdError.setVisibility(View.GONE);
            return true;

        }
    }


}