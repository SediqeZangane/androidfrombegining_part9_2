package com.example.androidfrombegining;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Part9_2Activity extends AppCompatActivity {
    ImageView img_set;
    private static final int setImageRequestCode = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part9_2);
        init();
        Control();
    }

    private void init() {
        img_set = findViewById(R.id.img_set_pic);
    }

    private void Control() {
        img_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("image/*");
                startActivityForResult(i, setImageRequestCode);
            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == setImageRequestCode && requestCode == RESULT_OK) {
            img_set.setImageURI(data.getData());

        }

    }

}