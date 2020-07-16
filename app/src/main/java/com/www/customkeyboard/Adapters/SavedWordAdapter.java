package com.www.customkeyboard.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.www.customkeyboard.R;
import com.www.customkeyboard.ViewModel.SavedWordModel;

import java.util.ArrayList;

public class SavedWordAdapter extends RecyclerView.Adapter<SavedWordAdapter.Viewholder> {
Context context;
ArrayList<SavedWordModel> arrayList;

    public SavedWordAdapter(Context context, ArrayList<SavedWordModel> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.data_saved_word,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        SavedWordModel model= arrayList.get(position);

        holder.word.setText(model.getWord());
        holder.remove.setText(model.getRemove());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView word,remove;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            word=itemView.findViewById(R.id.word);
            remove=itemView.findViewById(R.id.remove);
        }
    }
}
