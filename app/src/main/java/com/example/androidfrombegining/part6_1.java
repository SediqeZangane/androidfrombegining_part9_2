package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class part6_1 extends AppCompatActivity {
    EditText editTextchanger;
    TextView textView;
    Button btntextchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part6_1);
        initViews();
        ControlViews();
    }

    private void initViews() {
        editTextchanger = findViewById(R.id.edt_text_changer);
        textView = findViewById(R.id.txt_View);
        btntextchange = findViewById(R.id.btn_text_change);
    }

    private void ControlViews() {
//        editTextchanger.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//              //  textView.setText(s);
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                textView.setText(s);
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//              //  textView.setText(s);
//
//            }
//        });
        btntextchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editTextchanger.getText());
            }
        });


    }
}