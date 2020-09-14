package com.example.androidfrombegining;

import androidx.appcompat.app.AppCompatActivity;
import part5Usermodel.part5Usermodel;
import part5Usermodel.part5Usermodel2;


import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_mainn);
        part5Usermodel newuser = new part5Usermodel();
        newuser.setName("aaaaaaaaa");
        newuser.setAge(1111111);
        part5Usermodel newuser2 = new part5Usermodel();
        newuser2.setName("bbbbbbbb");
        newuser2.setAge(222222222);
        part5Usermodel2.age = 12;
        Log.d("MY_KEY",part5Usermodel2.age+" "+"dfd"+"   "+newuser.getName()+"  "+newuser2.getName());

        part5Usermodel2.age = 34;

         Log.d("MY_KEY",part5Usermodel2.age+" "+"dfd"+"   "+newuser.getName()+"  "+newuser2.getName());
    }
}