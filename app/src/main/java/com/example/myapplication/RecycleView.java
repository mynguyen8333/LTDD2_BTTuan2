package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;
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
    public void itemclick(Talor talor, ImageView img) {
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
        Intent intent = new Intent(RecycleView.this, Bai3.class);
        //intent.putExtra("taylor", (Serializable) talor);

        ActivityOptionsCompat options =  ActivityOptionsCompat.makeSceneTransitionAnimation(
                RecycleView.this, img,
                ViewCompat.getTransitionName(img));
        startActivity(intent,options.toBundle());
    }

    @Override
    public void imageCLick(Talor talor) {

    }
}