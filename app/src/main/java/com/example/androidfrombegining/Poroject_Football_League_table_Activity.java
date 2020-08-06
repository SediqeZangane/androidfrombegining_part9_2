
package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Poroject_Football_League_table_Activity extends AppCompatActivity {
    RecyclerView recyclerViewDATA;
    List<Poroject_football_league_table_dataModel> dataModels;
    Poroject_football_league_table_Adapter MyADAPTER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poroject__football__league_table_);
        dataModels = new ArrayList<>();
        dataModels.add(new Poroject_football_league_table_dataModel(1, R.drawable.ic_baseline_flag_24, "milan", 3, 2, 1, 4, 6));
        dataModels.add(new Poroject_football_league_table_dataModel(2, R.drawable.ic_baseline_flag_24, "inter", 7, 2, 5, 4, 3));

        init();
        Control();
    }

    private void init() {
        recyclerViewDATA = findViewById(R.id.recyclerView_DATA);


    }

    private void Control() {
        MyADAPTER = new Poroject_football_league_table_Adapter(Poroject_Football_League_table_Activity.this, dataModels);
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.ItemAnimator animator = new DefaultItemAnimator();


        recyclerViewDATA.setLayoutManager(lManager);
        recyclerViewDATA.setItemAnimator(animator);
        recyclerViewDATA.setAdapter(MyADAPTER);
    }
}