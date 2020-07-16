package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivityOtpBinding;

public class Otp extends AppCompatActivity {

    ActivityOtpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_otp);

        //for removing error after pin completion

        binding.otp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String pin=binding.otp.getText().toString().trim();
                if(pin.length()==4){
                    binding.tvOtpError.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otp= binding.otp.getText().toString().trim();
                if(otp.length()<4){
                    binding.tvOtpError.setVisibility(View.VISIBLE);
                }
                else{
                    binding.tvOtpError.setVisibility(View.GONE);
                    Intent intent=new Intent(Otp.this,SignIn.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}