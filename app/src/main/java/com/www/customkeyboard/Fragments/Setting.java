package com.www.customkeyboard.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.www.customkeyboard.R;


public class Setting extends Fragment {


Context context;
    public Setting(Context context) {
        this.context=context;
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_setting, container, false);

        LinearLayout myAccount= view.findViewById(R.id.my_account);
        myAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container,new ProfileFragment(context)).commit();
            }
        });
        return view;
    }
}