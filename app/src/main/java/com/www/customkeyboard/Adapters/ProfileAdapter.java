package com.www.customkeyboard.Adapters;

import android.content.Context;
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
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.www.customkeyboard.Activity.Home;
<<<<<<< HEAD
import com.www.customkeyboard.Fragments.CustomThemeFragment;
=======
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import com.www.customkeyboard.Fragments.FragmentSavedWord;
import com.www.customkeyboard.Fragments.ProfileFragment;
import com.www.customkeyboard.MainActivity;
import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.ProfileModel;
import com.www.customkeyboard.ViewModel.SavedWordModel;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder>{
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.LinearLayout;
=======
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.ProfileModel;

import java.util.ArrayList;

<<<<<<< HEAD
public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder>{
=======
public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

    Context context;
    ArrayList<ProfileModel> arrayList;

    public ProfileAdapter(Context context, ArrayList<ProfileModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

<<<<<<< HEAD
        final ProfileModel model= arrayList.get(position);
=======
<<<<<<< HEAD
        final ProfileModel model= arrayList.get(position);
=======
<<<<<<< HEAD
        final ProfileModel model= arrayList.get(position);
=======
<<<<<<< HEAD
        final ProfileModel model= arrayList.get(position);
=======
<<<<<<< HEAD
        final ProfileModel model= arrayList.get(position);
=======
        ProfileModel model= arrayList.get(position);
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        holder.num.setText(model.getNum());
        holder.tittle.setText(model.getTitle());
        holder.subtitle.setText(model.getSubtitle());

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
        holder.savedWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                fragment_jump(model);
              String value= model.getTitle().toString();
              switch (value){
                  case "SAVED WORDS":
                      AppCompatActivity appCompatActivity= (AppCompatActivity) v.getContext();
                      Fragment myfragment=new FragmentSavedWord(context);
                      appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,myfragment).commit();
                      break;
                  case "CUSTOM THEMES":
<<<<<<< HEAD
                      AppCompatActivity appCompatActivity1= (AppCompatActivity) v.getContext();
                     Fragment fragment=new CustomThemeFragment(context);
                     appCompatActivity1.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
=======
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                      break;


                  case "TAPS SAVED":
                      break;



                  case "WORDS COMPLETED":
                      break;


              }

            }
        });



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
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView num,tittle,subtitle;
<<<<<<< HEAD
        LinearLayout savedWords;
=======
<<<<<<< HEAD
        LinearLayout savedWords;
=======
<<<<<<< HEAD
        LinearLayout savedWords;
=======
<<<<<<< HEAD
        LinearLayout savedWords;
=======
<<<<<<< HEAD
        LinearLayout savedWords;
=======
<<<<<<< HEAD
        LinearLayout savedWords;
=======
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            num=itemView.findViewById(R.id.tv_recycle_num);
            tittle=itemView.findViewById(R.id.tv_recycle_title);
            subtitle=itemView.findViewById(R.id.tv_recycle_subtitle);
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);


=======
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);


=======
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);


=======
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);


=======
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);


=======
<<<<<<< HEAD
            savedWords=itemView.findViewById(R.id.ll_savedWords);

>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
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

=======
=======

        }
    }
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
}
