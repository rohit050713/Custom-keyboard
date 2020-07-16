package com.www.customkeyboard.Fragments;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.www.customkeyboard.R;

import java.util.regex.Pattern;


public class EditProfileFragment extends Fragment {

    public static final Pattern Phone= Pattern.compile("^[+]?(0)?[1-9 ][0-9 ]{6,16}$");
    public static final Pattern Name= Pattern.compile("^([A-Za-z]+ )+[A-Za-z]+$|^[A-Za-z]+$");

    CircularImageView imageView;
    int REQUEST_CAMERA=1, SELECT_FILE=0;
    ImageView edit_btn;

    Context context;
   EditText email,name1,num;
   TextView email_error,name1_error,num_error;
   ImageView profile,back;
   TextView edit;
    public EditProfileFragment(Context context) {
        this.context=context;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_edit_profile, container, false);
        //for selecting the image
        imageView= view.findViewById(R.id.circular_img);
        edit_btn=view.findViewById(R.id.edit_btn);

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectImage();
            }
        });


        back=view.findViewById(R.id.iv_edit_profile_back);

        name1=view.findViewById(R.id.et_edit_name);
        email=view.findViewById(R.id.et_edit_email_address);
        num=view.findViewById(R.id.et_edit_phone_number);
        profile=view.findViewById(R.id.circular_img);

        edit=view.findViewById(R.id.tv_edit);
        email_error=view.findViewById(R.id.tv_edit_email_error);
        name1_error=view.findViewById(R.id.tv_edit_name_error);
        num_error=view.findViewById(R.id.tv_edit_phone_error);

        //for getting value from my account fragment
        String name= getArguments().getString("name");
        String mail=getArguments().getString("mail");
        String number= getArguments().getString("num");
int image= getArguments().getInt("img");

        //for img
        byte[] b= getArguments().getByteArray("img");
        Bitmap bmp= BitmapFactory.decodeByteArray(b,0,b.length);


        name1.setText(name);
        email.setText(mail);
        num.setText(number);


        profile.setImageBitmap(bmp);

        // for editing the value and sending it back to my account fragment

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!validate_name() | !validate_mail() | !validate_phone()){
                   return;
               }
               else{
                   //edited values
                   ProfileFragment fragment= new ProfileFragment(context);
                   Bundle args=new Bundle();

                   args.putString("edited_name",name1.getText().toString());
                   args.putString("edited_email",email.getText().toString());
                   args.putString("edited_num",num.getText().toString());

                   fragment.setArguments(args);

                   getFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();
               }
            }
        });

        //back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container,new ProfileFragment(context)).commit();
            }
        });

        return view;
    }
    public boolean validate_mail(){
        String a= email.getText().toString().trim();
        if(a.isEmpty()){
            email_error.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(a).matches()){
            email_error.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            email_error.setVisibility(View.GONE);
            return true;
        }
    }

    public boolean validate_phone(){
        String b= num.getText().toString().trim();
        if(b.isEmpty()){
            num_error.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Phone.matcher(b).matches()){
            num_error.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            num_error.setVisibility(View.GONE);
            return true;
        }
    }

    public boolean validate_name(){
        String c= name1.getText().toString().trim();
        if(c.isEmpty()){
            name1_error.setVisibility(View.VISIBLE);
            return false;
        }
        else if(!Name.matcher(c).matches()){
            name1_error.setVisibility(View.VISIBLE);
            return false;
        }
        else{
            name1_error.setVisibility(View.GONE);
            return true;
        }
    }

    public void SelectImage(){
        final CharSequence[] item={"Gallery","Camera","Cancel"};

        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("Add Image");
        builder.setCancelable(false);
        builder.setItems(item, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(item[which].equals("Camera")){
                    if(ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
                        ActivityCompat.requestPermissions((Activity) context,new String[]{Manifest.permission.CAMERA},REQUEST_CAMERA);
                    }
                    else {
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(intent, REQUEST_CAMERA);
                    }
                }
                else if(item[which].equals("Gallery")){
                    Intent intent=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    startActivityForResult(intent.createChooser(intent,"Select File"),SELECT_FILE);

                }
                else if(item[which].equals("Cancel")){
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode== Activity.RESULT_OK){
            if(requestCode==REQUEST_CAMERA){

                Bundle bundle= data.getExtras();
                final Bitmap bitmap= (Bitmap) bundle.get("data");
                imageView.setImageBitmap(bitmap);
            }
            else if(requestCode==SELECT_FILE){
                Uri selected_uri=data.getData();
                imageView.setImageURI(selected_uri);
            }
        }
    }
}