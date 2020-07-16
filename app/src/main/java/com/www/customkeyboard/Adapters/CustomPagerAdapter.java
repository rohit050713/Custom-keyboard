package com.www.customkeyboard.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import com.www.customkeyboard.ViewModel.HomePagerModel;

import java.util.ArrayList;

public class CustomPagerAdapter extends PagerAdapter {



    private Context context;
    ArrayList<HomePagerModel> arrayList;

    public CustomPagerAdapter(Context context, ArrayList<HomePagerModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        HomePagerModel model= arrayList.get(position);
        ViewGroup layout = (ViewGroup) LayoutInflater.from(context).inflate(model.getLayout_id(),container,false);
        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        HomePagerModel value= arrayList.get(position);
//
//        return context.getString(value.getTitle_id());
//    }
}
