package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Part12_Activity extends AppCompatActivity {
    String[] names;
    Button addToList;
    ListView showNames;
    List<String> names2;
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part12_);
//        names = new String[]{"mohammad", "ali"};
        names2 = new ArrayList<>();
        names2.add("mohammad");
        names2.add("ali");
        init();
        Control();
    }

    private void init() {
        showNames = findViewById(R.id.lst_show_names);
        addToList = findViewById(R.id.btn_add_to_list);
    }

    private void Control() {
        myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text1, names2);
        showNames.setAdapter(myAdapter);
        Listener();
    }

    private void Listener() {
        addToList.setOnClickListener(v -> {
//                names = new String[]{"mohammad", "ali", "taghi"};
            names2.add("taqi");
            myAdapter.notifyDataSetChanged();
        });

    }
}