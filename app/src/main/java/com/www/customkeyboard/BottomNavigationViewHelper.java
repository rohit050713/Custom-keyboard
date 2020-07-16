package com.www.customkeyboard;

import android.util.Log;


import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.lang.reflect.Field;

public class BottomNavigationViewHelper {
    private static final String TAG = "bottomNavigationViewHel";

    public static void setupBottomnavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setupBottomnavigationView: setting up bottom navigation view");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
    }
}
