package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class part8_1 extends AppCompatActivity {
    RadioButton red, gray;
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part8_1);
        initViewS();
        ControlViews();
    }

    private void initViewS() {
        red = findViewById(R.id.radio_red);
        gray = findViewById(R.id.radio_gray);
        test = findViewById(R.id.txt_View);
    }

    private void ControlViews() {
        red.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                test.setTextColor(Color.RED);
                test.setText(R.string.radio_button);
            }
        });
        gray.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    test.setTextColor(Color.GRAY);
            }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red.setChecked(true);
//                gray.setChecked(false);
//            test.setTextColor(Color.RED);
                //budo nabude 2khate bala tasiri nadare
            }
        });

    }
}