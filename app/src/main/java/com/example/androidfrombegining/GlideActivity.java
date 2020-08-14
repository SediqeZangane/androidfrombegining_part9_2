package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        initVIew();
        controlView();
    }

    private void initVIew() {
        img = (ImageView) findViewById(R.id.img);
        btn = (Button) findViewById(R.id.btn);
    }

    private void controlView() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(GlideActivity.this).load("https://apod.nasa.gov/apod/image/2003/SaturnMoon_Sojuel_1824.jpg").into(img);
            }
        });
    }
}