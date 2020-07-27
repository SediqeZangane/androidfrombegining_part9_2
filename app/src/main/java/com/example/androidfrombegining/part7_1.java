package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class part7_1 extends AppCompatActivity {
    Switch swh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7_1);
        initViews();
        ControlViews();

    }

    private void initViews() {
        swh = findViewById(R.id.swh_test);
    }

    private void ControlViews() {
        swh.setChecked(true);
        swh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    swh.setText("روشن شد");
                    // Toast.makeText(part7_1.this, "is checked", Toast.LENGTH_SHORT).show();
                } else {
                    swh.setText("خاموش شد");
                    //  Toast.makeText(part7_1.this, "isNOT checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}