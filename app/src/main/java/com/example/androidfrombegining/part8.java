package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class part8 extends AppCompatActivity {
    CheckBox chbtextcolor, chbbackcolor;
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8);
        initViews();
        ControlViews();

    }

    private void initViews() {
        chbtextcolor = findViewById(R.id.chb_text_color);
        chbbackcolor = findViewById(R.id.chb_back_color);
        test = findViewById(R.id.txt_test_event);
    }

    private void ControlViews() {
        chbtextcolor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    test.setTextColor(Color.RED);
                } else {
                    test.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        chbbackcolor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    test.setBackgroundColor(Color.GRAY);
                } else {
                    test.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
    }
}