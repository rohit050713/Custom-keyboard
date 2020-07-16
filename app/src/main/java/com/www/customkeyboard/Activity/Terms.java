package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivityTermsBinding;

public class Terms extends AppCompatActivity {

    ActivityTermsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_terms);

        binding.termsCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.termsCheckbox.isChecked()){
                    Intent intent=new Intent(Terms.this,Setup.class);
                    startActivity(intent);
                }
            }
        });
    }
}