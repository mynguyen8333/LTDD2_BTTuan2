package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity implements Onclick{
    RecyclerView rsv_talor;
    CustomAdapter adt;
    ArrayList<Talor> mTalors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mTalors = new ArrayList<>();
        rsv_talor = findViewById(R.id.rsv_talor);

        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));
        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));
        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));
        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));
        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));
        mTalors.add(new Talor(R.drawable.talo,"Taylor Swift","Love Story"));

        adt = new CustomAdapter(mTalors,this);
        rsv_talor.setHasFixedSize(true);
        rsv_talor.setAdapter(adt);
        rsv_talor.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));



    }

    @Override
    public void itemclick(Talor talor) {
//        Fade fade1 = new Fade();
//        View decor1 = getWindow().getDecorView();
//
//        getWindow().setEnterTransition(fade1);
//        getWindow().setExitTransition(fade1);

        Intent intent = new Intent(RecycleView.this,Bai3.class);
        startActivity(intent);
    }
}