package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivityLoginOptionBinding;

public class LoginOption extends AppCompatActivity {

    ActivityLoginOptionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding= DataBindingUtil.setContentView(this,R.layout.activity_login_option);

      //create account listener
      binding.btnCreateAccount.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(LoginOption.this,CrearteAccount.class);
              startActivity(intent);
              finish();

          }
      });

      // sign in listener
        binding.btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginOption.this,SignIn.class);
                startActivity(intent);
                finish();
            }
        });

        //skip listener
        binding.skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginOption.this,SignIn.class);
                startActivity(intent);
                finish();
            }
        });
    }
}