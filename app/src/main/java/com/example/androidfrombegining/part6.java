package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class part6 extends AppCompatActivity {
    TextView txthello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part6);
        initViews();
        ControlViews();
    }

    private void initViews() {
        txthello = findViewById(R.id.txt_hello);
    }
    private  void ControlViews(){
        txthello.setText("hello world!!!!!!!");
    }
}