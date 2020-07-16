package com.www.customkeyboard.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
<<<<<<< HEAD
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
=======
<<<<<<< HEAD
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
=======
<<<<<<< HEAD
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
=======
<<<<<<< HEAD
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
=======
<<<<<<< HEAD
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

import android.os.Bundle;
>>>>>>> 164bb6b7ab55febc6716a7e17a6c5812824b6705
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.www.customkeyboard.Adapters.CustomPagerAdapter;
import com.www.customkeyboard.BottomNavigationViewHelper;
import com.www.customkeyboard.Fragments.Setting;
import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.HomePagerModel;
import com.www.customkeyboard.databinding.ActivityHomeBinding;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;
=======
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

import me.relex.circleindicator.CircleIndicator;

public class Home extends AppCompatActivity {

    ActivityHomeBinding binding;
    CircleIndicator circleIndicator;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    private  CustomPagerAdapter adapter;
    ArrayList<HomePagerModel> values =new ArrayList<>();
    int title[]={R.string.slide1,R.string.slide2,R.string.slide3};
    int layout[]={R.layout.home_slide1,R.layout.home_slide2,R.layout.home_slide3};


<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
//    private Handler handler;
//    private int delay=5000;
//    private int page=0;
//
//    Runnable runnable=new Runnable() {
//        @Override
//        public void run() {
//            if(adapter.getCount() == page){
//                page = 0;
//            }
//            else{
//                page++;
//            }
//            binding.viewpager.setCurrentItem(page,true);
//            handler.postDelayed(this,delay);
//        }
//    };

=======
    ArrayList<HomePagerModel> values =new ArrayList<>();
    int title[]={R.string.slide1,R.string.slide2,R.string.slide3};
    int layout[]={R.layout.home_slide1,R.layout.home_slide2,R.layout.home_slide3};
>>>>>>> 164bb6b7ab55febc6716a7e17a6c5812824b6705
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_home);

        // for removing animation from the bottom navigation view
        BottomNavigationViewHelper.setupBottomnavigationView((BottomNavigationViewEx) binding.navigationView);

        binding.navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Setting(Home.this)).commit();
                }
                return false;
            }
        });


        for(int i=0;i<title.length;i++){
            HomePagerModel model=new HomePagerModel(title[i],layout[i]);
            values.add(model);
        }


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
       adapter = new CustomPagerAdapter(this,values);
        binding.viewpager.setAdapter(adapter);


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

        binding.circleIndicator.setViewPager(binding.viewpager);


        // timer task for autoscroll
        Timer timer=new Timer();
        timer.schedule(new SliderTimer(),3000,3000);

    }

    //for autoscroll
      private class SliderTimer extends TimerTask{

          @Override
          public void run() {
              Home.this.runOnUiThread(new Runnable() {
                  @Override
                  public void run() {
                      if(binding.viewpager.getCurrentItem()< values.size()-1){
                          binding.viewpager.setCurrentItem(binding.viewpager.getCurrentItem()+1);
                      }
                      else{
                          binding.viewpager.setCurrentItem(0);
                      }
                  }
              });
          }
      }


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
      // for the fragment jump
      public void switchContent(int id, Fragment fragment){
          FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
          ft.replace(id,fragment,fragment.toString());
          ft.addToBackStack(null);
          ft.commit();

      }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
=======
        binding.viewpager.setAdapter(new CustomPagerAdapter(this,values));
>>>>>>> 164bb6b7ab55febc6716a7e17a6c5812824b6705

        binding.circleIndicator.setViewPager(binding.viewpager);

    }
<<<<<<< HEAD



=======
>>>>>>> 164bb6b7ab55febc6716a7e17a6c5812824b6705
>>>>>>> 433a7a8f6be1ec33df1ad5a0a467e4cc51311ac5
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
}