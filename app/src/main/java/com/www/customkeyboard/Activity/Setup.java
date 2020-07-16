package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.www.customkeyboard.MainActivity;
import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivitySetupBinding;

public class Setup extends AppCompatActivity {

    ActivitySetupBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_setup);

       // choose listener
       binding.choose.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Setup.this, MainActivity.class);
               startActivity(intent);
               finish();
           }
       });
    }
}