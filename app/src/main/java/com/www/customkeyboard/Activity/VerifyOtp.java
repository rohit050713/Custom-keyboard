package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivityVerifyOtpBinding;

public class VerifyOtp extends AppCompatActivity {

    ActivityVerifyOtpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_verify_otp);

       //for removing error after pin completion
       binding.pin.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {

           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
            String pin=binding.pin.getText().toString().trim();
            if(pin.length()==4){
                binding.tvVerifyPinError.setVisibility(View.GONE);
            }
           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });


       binding.confirm.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String pin= binding.pin.getText().toString().trim();

               if(pin.length()<4){
                   binding.tvVerifyPinError.setVisibility(View.VISIBLE);
               }
               else{
                   binding.tvVerifyPinError.setVisibility(View.GONE);
                   Intent intent=new Intent(VerifyOtp.this,Otp.class);
                   startActivity(intent);
                   finish();
               }
           }
       });
    }
}