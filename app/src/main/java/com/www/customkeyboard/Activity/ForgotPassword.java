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
import com.www.customkeyboard.databinding.ActivityForgotPasswordBinding;

public class ForgotPassword extends AppCompatActivity {

    ActivityForgotPasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_forgot_password);

        binding.etForgotEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.tvForgotEmailStar.setVisibility(View.GONE);
                String email=binding.etForgotEmail.getText().toString().trim();
                if(email.isEmpty()){
                    binding.tvForgotEmailError.setVisibility(View.VISIBLE);
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    binding.tvForgotEmailError.setVisibility(View.VISIBLE);

                }
                else{
                    binding.tvForgotEmailError.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // sign in listener
        binding.tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgotPassword.this,SignIn.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void submit(View view){
        if(!validatemail()){
            return;
        }
        else{
            Intent intent=new Intent(ForgotPassword.this,VerifyOtp.class);
            startActivity(intent);
        }
    }


    public boolean validatemail(){
        String email=binding.etForgotEmail.getText().toString().trim();
        if(email.isEmpty()){
            binding.tvForgotEmailError.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tvForgotEmailError.setVisibility(View.VISIBLE);
            return false;

        }
        else{
            binding.tvForgotEmailError.setVisibility(View.GONE);
            return true;
        }

    }

}