package com.www.customkeyboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.www.customkeyboard.BottomNavigationViewHelper;
import com.www.customkeyboard.Fragments.ProfileFragment;
import com.www.customkeyboard.R;
import com.www.customkeyboard.databinding.ActivitySettingsBinding;

public class Settings extends AppCompatActivity {

    ActivitySettingsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_settings);

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

BottomNavigationViewHelper.setupBottomnavigationView((BottomNavigationViewEx) binding.navigationView);

binding.myAccount.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,new ProfileFragment(Settings.this)).commit();
    }
});
    }
}