package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Part14Activity extends AppCompatActivity {
    Button add;
    RecyclerView recyclerViewshowNAMES;
    List<Part13UserModel> models;
    Part14MyrecycleAdapter adapterrrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part14);
        models = new ArrayList<>();
        models.add(new Part13UserModel("sediqe", "zangane", R.mipmap.ic_launcher_round, false));
        models.add(new Part13UserModel("Abolfazl", "zangane", R.mipmap.ic_launcher, false));
        models.add(new Part13UserModel("mehdi", "shahbazi", R.mipmap.ic_launcher_round, true));
        models.add(new Part13UserModel("sediqe", "zangane", R.mipmap.ic_launcher, false));
        models.add(new Part13UserModel("Maryam", "hosseini", R.mipmap.ic_launcher, true));
        init();
        Control();
    }

    private void init() {
        recyclerViewshowNAMES = findViewById(R.id.rcl_show_names);
        add = findViewById(R.id.btnn_add);

    }

    private void Control() {
        adapterrrr = new Part14MyrecycleAdapter(Part14Activity.this, models);
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.ItemAnimator animator = new DefaultItemAnimator();


        recyclerViewshowNAMES.setLayoutManager(lManager);
        recyclerViewshowNAMES.setItemAnimator(animator);
        recyclerViewshowNAMES.setAdapter(adapterrrr);
        Listener();

    }

    private void Listener() {

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                models.add(new Part13UserModel("A", "B", R.mipmap.ic_launcher, false));
                adapterrrr.notifyDataSetChanged();
            }
        });
    }

}