package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Part10_Activity extends AppCompatActivity {
    TextView showdata;
    EditText inputdata;
    Button savedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part10_);
        init();
        Control();
    }

    private void init() {
        showdata = findViewById(R.id.txt_show_data);
        inputdata = findViewById(R.id.edt_input_data);
        savedata = findViewById(R.id.btn_save_data);
    }

    private void Control() {
        setDATA();
        savedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputdata.getText().toString().equalsIgnoreCase("")) {
                    SharedPreferences zakhireDATA = getSharedPreferences("my_data", MODE_PRIVATE);
//                    zakhireDATA.edit().putBoolean("data_state", true).apply();
                    zakhireDATA.edit().putString("data_content", inputdata.getText().toString()).apply();
                    Toast.makeText(Part10_Activity.this, "your data is saved", Toast.LENGTH_SHORT).show();
                    inputdata.setText("");
                    setDATA();
                } else {
                    Toast.makeText(Part10_Activity.this, "please enter data in edit text", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    private void setDATA() {
        SharedPreferences zakhireDATA = getSharedPreferences("my_data", MODE_PRIVATE);
//     boolean dataState = zakhireDATA.getBoolean("data_state", false);
//        if (dataState) {
        String dataContent = zakhireDATA.getString("data_content", "هنوز داده ای وارد نشده");
        showdata.setText(dataContent);
//        }

    }
}