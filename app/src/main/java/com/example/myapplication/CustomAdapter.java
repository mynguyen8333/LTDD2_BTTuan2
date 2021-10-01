package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<Talor> mTalors;
    private Onclick onclick;

    public CustomAdapter(ArrayList<Talor> mTalors, Onclick onclick) {
        this.mTalors = mTalors;
        this.onclick = onclick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mTalors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Talor talorclick;
        ImageView img;
        TextView tvname,tvnamesong;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img_talo);
            tvname = itemView.findViewById(R.id.tv_tencs);
            tvnamesong = itemView.findViewById(R.id.tv_baihat);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onclick.itemclick(talorclick);
                }
            });
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Talor talor = mTalors.get(position);
        holder.talorclick = talor;
        holder.img.setImageResource(talor.getImgview());
        holder.tvname.setText(talor.getTv_name());
        holder.tvnamesong.setText(talor.getTv_songname());
    }
}
