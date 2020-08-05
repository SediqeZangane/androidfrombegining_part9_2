package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Part13Activity extends AppCompatActivity {
    Button addToList;
    ListView showNames;
    List<Part13UserModel> MyUsers;
    Part13MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part13);
        MyUsers = new ArrayList<>();
        MyUsers.add(new Part13UserModel("sediqe", "zangane", R.mipmap.ic_launcher_round, false));
        MyUsers.add(new Part13UserModel("Abolfazl", "zangane", R.mipmap.ic_launcher, false));
        MyUsers.add(new Part13UserModel("mehdi", "shahbazi", R.mipmap.ic_launcher_round, true));
        MyUsers.add(new Part13UserModel("sediqe", "zangane", R.mipmap.ic_launcher, false));
        MyUsers.add(new Part13UserModel("Maryam", "hosseini", R.mipmap.ic_launcher, true));
        init();
        Control();
    }

    private void init() {
        showNames = findViewById(R.id.list_show);
        addToList = findViewById(R.id.button_add_to_list);

    }

    private void Control() {
        myAdapter = new Part13MyAdapter(Part13Activity.this, MyUsers);
        showNames.setAdapter(myAdapter);
        Listener();




    }

    private void Listener() {
        addToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyUsers.add(new Part13UserModel("A", "B", R.mipmap.ic_launcher, false));
                myAdapter.notifyDataSetChanged();
            }
        });
        showNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = MyUsers.get(position).getName();
                if (!MyUsers.get(position).isSeen()) {
                    MyUsers.get(position).setSeen(true);
                    myAdapter.notifyDataSetChanged();
                }
                Toast.makeText(Part13Activity.this, " name is " + name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}