package com.www.customkeyboard.Fragments;

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
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
<<<<<<< HEAD
import android.opengl.Visibility;
=======
<<<<<<< HEAD
import android.opengl.Visibility;
=======
<<<<<<< HEAD
import android.opengl.Visibility;
=======
<<<<<<< HEAD
import android.opengl.Visibility;
=======
=======
import android.content.Context;
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
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
import android.widget.ImageView;
import android.widget.TextView;
=======
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

import com.www.customkeyboard.Adapters.SavedWordAdapter;
import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.SavedWordModel;

import java.util.ArrayList;


public class FragmentSavedWord extends Fragment {



    Context context;
   ArrayList<SavedWordModel> values=new ArrayList<>();
   RecyclerView recyclerView;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
   ImageView back;
   TextView add,add_word;
   TextView close;
   Spinner spinner;
   EditText et_words;

    String word[]={"Abstract","Calendar","Calculate","Fancy","Harsh","Knowledge","Parallel","Technique"};
    String remove[]={"X remove","X remove","X remove","X remove","X remove","X remove","X remove","X remove"};
    String language[]={"Select Language","English","Hindi","Arabic"};
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
   ImageView back;
   TextView add,add_word;
   TextView close;
=======
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
    String word[]={"Abstract","Calendar","Calculate","Fancy","Harsh","Knowledge","Parallel","Technique"};
    String remove[]={"X remove","X remove","X remove","X remove","X remove","X remove","X remove","X remove"};
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    public FragmentSavedWord(Context context) {
        this.context=context;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_saved_word, container, false);

<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        for(int i=0;i<word.length;i++){
            SavedWordModel model=new SavedWordModel(word[i],remove[i]);
            values.add(model);
        }

        recyclerView=view.findViewById(R.id.saved_words_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

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
        final SavedWordAdapter adapter=new SavedWordAdapter(context,values);
        recyclerView.setAdapter(adapter);

        //back button
        back=view.findViewById(R.id.iv_mywords_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.frame_container,new ProfileFragment(context)).commit();
            }
        });



        //add button
        add =view.findViewById(R.id.tv_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog=new Dialog(context);
                dialog.setContentView(R.layout.dialog_addword);
                dialog.setCancelable(false);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                et_words=dialog.findViewById(R.id.et_type_words);
                final TextView tv_words_error=dialog.findViewById(R.id.tv_type_words_error);
                final TextView tv_language_error=dialog.findViewById(R.id.tv_language_select_error);

                //for spinner
                spinner=dialog.findViewById(R.id.sp_reset_cnfpassword);
                spinner.setAdapter(new ArrayAdapter<CharSequence>(context,android.R.layout.simple_spinner_dropdown_item,language));

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                //close dialog
                close=dialog.findViewById(R.id.tv_addword_close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                    dialog.dismiss();
                    }
                });


                et_words.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        String words= et_words.getText().toString().trim();
                     if(words.isEmpty()){
                         tv_words_error.setVisibility(View.VISIBLE);
                     }
                     else{
                         tv_words_error.setVisibility(View.GONE);
                     }
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });


                // for spinner
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String lang= spinner.getSelectedItem().toString();
                        if(lang.equals("Selected Language")){
                            tv_language_error.setVisibility(View.VISIBLE);
                        }
                        else {
                            tv_language_error.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
                        dialog.dismiss();
                    }
                });
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                // for add button
                add_word=dialog.findViewById(R.id.tv_add_word);
                add_word.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                        String words= et_words.getText().toString().trim();
                         String language_value= spinner.getSelectedItem().toString();

                        if(words.isEmpty()){
                            tv_words_error.setVisibility(View.VISIBLE);
                            return;
                        }
                        else if(language_value.equals("Select Language")){
                            tv_language_error.setVisibility(View.VISIBLE);
                            return;
                        }
                        else if(tv_words_error.getVisibility()==View.VISIBLE | tv_language_error.getVisibility()== View.VISIBLE){
                            return;
                        }
                        else{
                            tv_language_error.setVisibility(View.GONE);
                            tv_words_error.setVisibility(View.GONE);
                            dialog.dismiss();

                        }

                    }
                });




<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
                        dialog.dismiss();
                    }
                });

>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
                if(dialog.getWindow()!=null){
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                }
                dialog.show();
<<<<<<< HEAD

            }
        });

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb

            }
        });

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
            }
        });

=======
        SavedWordAdapter adapter=new SavedWordAdapter(context,values);
        recyclerView.setAdapter(adapter);

>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
        return view;
    }
}