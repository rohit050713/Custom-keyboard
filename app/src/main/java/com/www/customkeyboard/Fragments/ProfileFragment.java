package com.www.customkeyboard.Fragments;

import android.app.Dialog;
import android.content.Context;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
<<<<<<< HEAD
import com.chaos.view.PinView;
=======
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import com.www.customkeyboard.Adapters.ProfileAdapter;
import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.ProfileModel;

<<<<<<< HEAD
import java.io.ByteArrayOutputStream;
=======
<<<<<<< HEAD
import java.io.ByteArrayOutputStream;
=======
<<<<<<< HEAD
import java.io.ByteArrayOutputStream;
=======
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    RecyclerView recyclerView;
<<<<<<< HEAD
    TextView updatePassword,editProfile;
    TextView profile_name,profile_num,profile_mail;
    ImageView profile_img;
=======
<<<<<<< HEAD
    TextView updatePassword,editProfile;
    TextView profile_name,profile_num,profile_mail;
    ImageView profile_img;
=======
<<<<<<< HEAD
    TextView updatePassword,editProfile;
    TextView profile_name,profile_num,profile_mail;
    ImageView profile_img;
=======
<<<<<<< HEAD
    TextView updatePassword,editProfile;
=======
<<<<<<< HEAD
    TextView updatePassword,editProfile;
=======
<<<<<<< HEAD
    TextView updatePassword,editProfile;
=======
    TextView updatePassword;
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

    Context context;
    ArrayList<ProfileModel> values=new ArrayList<>();
    public ProfileFragment(Context context) {
        this.context = context;
    }

    private static final Pattern password= Pattern.compile("^[a-zA-Z0-9~!@#$%^&*()_+=-]{6,}$");

    String num[]={"659","100","1000","4,333"};
    String title[]={"SAVED WORDS","CUSTOM THEMES","TAPS SAVED","WORDS COMPLETED"};
    String subtitle[]={"View/Edit my saved words","View/Edit my themes","Mistari saved 1000 taps","Mistari completed 4333 words for you"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fragment_profile, container, false);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

        profile_name=view.findViewById(R.id.profile_name);
        profile_mail=view.findViewById(R.id.profile_mail);
        profile_num=view.findViewById(R.id.profile_num);
        profile_img=view.findViewById(R.id.profile_img);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
       //for getting recycler view value
        for(int i=0;i<num.length;i++){
            ProfileModel model=new ProfileModel(num[i],title[i],subtitle[i]);
            values.add(model);
        }
        recyclerView= view.findViewById(R.id.recyclerview);
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
        editProfile= view.findViewById(R.id.edit_profile);

//        editProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getFragmentManager().beginTransaction().replace(R.id.frame_container,new FragmentSavedWord(context)).commit();
//
//            }
//        });

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
        editProfile= view.findViewById(R.id.edit_profile);

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container,new FragmentSavedWord(context)).commit();

            }
        });

=======
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        ProfileAdapter adapter=new ProfileAdapter(context,values);
        recyclerView.setAdapter(adapter);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        // getting values from edit profile fragment


//        String name2= getArguments().getString("edited_name");
//        String email2= getArguments().getString("edited_email");
//        String num2= getArguments().getString("edited_num");
//
//       profile_name.setText(name2);
//       profile_mail.setText(email2);
//       profile_num.setText(num2);


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
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        // dialog
        updatePassword=view.findViewById(R.id.tv_update_password);
        updatePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.dialog_resetpassword);
                dialog.setCancelable(false);

                //for closing the dialog
                TextView close= dialog.findViewById(R.id.tv_reset_close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                //validation for password
                final EditText et_newPassword= dialog.findViewById(R.id.et_reset_password);
                et_newPassword.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                       TextView password_star= dialog.findViewById(R.id.tv_reset_password_star);
                       password_star.setVisibility(View.GONE);
                       String new_password= et_newPassword.getText().toString().trim();
                        TextView password_error=dialog.findViewById(R.id.tv_reset_password_error);

                        if(new_password.isEmpty()){
                           password_error.setVisibility(View.VISIBLE);
                       }
                        else if(!password.matcher(new_password).matches()){
                            password_error.setVisibility(View.VISIBLE);
                        }
                       else{
                           password_error.setVisibility(View.GONE);
                       }
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });

                //for confirm password validation
                final EditText et_cnfPassword=dialog.findViewById(R.id.et_reset_cnfpassword);
                et_cnfPassword.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        String new_password= et_newPassword.getText().toString().trim();

                        TextView cnfpassword_star= dialog.findViewById(R.id.tv_reset_cnf_password_star);
                        cnfpassword_star.setVisibility(View.GONE);
                        String new_cnfpassword= et_cnfPassword.getText().toString().trim();
                        TextView cnfpassword_error=dialog.findViewById(R.id.tv_reset_cnf_pswrd_error);

                        if(new_cnfpassword.isEmpty()){
                            cnfpassword_error.setVisibility(View.VISIBLE);
                        }
                        else if(!new_cnfpassword.equals(new_password)){
                            cnfpassword_error.setVisibility(View.VISIBLE);
                        }
                        else{
                            cnfpassword_error.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });

                //for validation when button clicked
                final LinearLayout llReset= dialog.findViewById(R.id.ll_reset_password);
                llReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       // for edit text pswrd
                        EditText et_newPass= dialog.findViewById(R.id.et_reset_password);
                        String new_password= et_newPass.getText().toString().trim();


                        //for edittext pswrd
                        EditText et_cnfPass=dialog.findViewById(R.id.et_reset_cnfpassword);
                        String new_cnfpassword= et_cnfPass.getText().toString().trim();

                        //for erroe texview
                        TextView password_error= dialog.findViewById(R.id.tv_reset_password_error);
                        TextView cnfpassword_error=dialog.findViewById(R.id.tv_reset_cnf_pswrd_error);

                        if(new_password.isEmpty()){
                            password_error.setVisibility(View.VISIBLE);
                            return;
                        }
                       else if(new_cnfpassword.isEmpty()){
                            cnfpassword_error.setVisibility(View.VISIBLE);
                            return;
                        }

                     else if(password_error.getVisibility() == View.VISIBLE | cnfpassword_error.getVisibility() == View.VISIBLE ){
                            return;
                        }
                        else{
                            password_error.setVisibility(View.GONE);
                            cnfpassword_error.setVisibility(View.GONE);
                            dialog.dismiss();
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======
<<<<<<< HEAD
                           dialog_restcode();
=======

>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                        }
                    }
                });

                if(dialog.getWindow()!=null){
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }
                dialog.show();
            }
        });

<<<<<<< HEAD
        // back button
=======
<<<<<<< HEAD
        // back button
=======
<<<<<<< HEAD
        // back button
=======
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        ImageView back= view.findViewById(R.id.iv_profile_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              getFragmentManager().beginTransaction().replace(R.id.frameLayout,new Setting(context)).commit();

            }
        });

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        // for edit profile click
        TextView edit=view.findViewById(R.id.edit_profile);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditProfileFragment ldf= new EditProfileFragment(context);
                Bundle args=new Bundle();
                args.putString("name",profile_name.getText().toString().trim());
                args.putString("mail",profile_mail.getText().toString().trim());
                args.putString("num",profile_num.getText().toString().trim());

                //for image transfer from one fragment to another
                Drawable drawable= profile_img.getDrawable();
                Bitmap bitimg= ((BitmapDrawable)drawable).getBitmap();
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                bitimg.compress(Bitmap.CompressFormat.PNG,100, baos);
                byte[] b= baos.toByteArray();

                args.putByteArray("img",b);


                ldf.setArguments(args);

                getFragmentManager().beginTransaction().replace(R.id.frame_container,ldf).commit();
            }
        });




        return view ;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
        return view ;
    }

=======
<<<<<<< HEAD
        return view ;
    }

=======
<<<<<<< HEAD
        return view ;
    }

=======
<<<<<<< HEAD
        return view ;
    }

=======
        // Inflate the layout for this fragment
        return view ;
    }

<<<<<<< HEAD
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    public void dialog_restcode(){
        final Dialog dialog1= new Dialog(context);

        dialog1.setContentView(R.layout.dialog_resetcode);
        dialog1.setCancelable(false);

        //for close button

        TextView close= dialog1.findViewById(R.id.tv_resetcode_close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });


        LinearLayout cnf= dialog1.findViewById(R.id.ll_reset_code);
        final PinView code=dialog1.findViewById(R.id.pin_view_reset_code);
        final TextView error=dialog1.findViewById(R.id.tv_resetcode_error);


        //code on click
        code.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String pin= code.getText().toString().trim();
                if(pin.length()==4){
                    error.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // btn on click
        cnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pin1= code.getText().toString().trim();
                if(pin1.length()<4){
                    error.setVisibility(View.VISIBLE);
                }
                else{
                    error.setVisibility(View.GONE);
                    dialog1.dismiss();
                    dialog_update();
                }
            }
        });

        if(dialog1.getWindow()!=null){
            dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog1.show();
    }

    public void dialog_update(){
        final Dialog dialog3= new Dialog(context);
        dialog3.setContentView(R.layout.dialog_success_password);
        dialog3.setCancelable(false);

        TextView done= dialog3.findViewById(R.id.password_update);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog3.dismiss();
            }
        });
        if(dialog3.getWindow()!=null){
            dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog3.show();
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
=======
>>>>>>> caf7bddc2d52f3dc15f52cfc660b51e301f0af2a
>>>>>>> b2a070ddbd2876710366d68b5da74da982219425
>>>>>>> 4355c2a8a73521d1ecb4d1f751d6548779fa868a
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7


}