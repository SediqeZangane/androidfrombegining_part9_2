package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class part7 extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part7);
        initViews();
        ControlViews();
    }

    private void initViews() {
        img = findViewById(R.id.imgShow);

    }

    private void ControlViews() {
        img.setImageResource(R.drawable.sedi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // img.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Toast.makeText(part7.this, "روی تصویر کلیک شد", Toast.LENGTH_SHORT).show();
            }
        });

    }
}