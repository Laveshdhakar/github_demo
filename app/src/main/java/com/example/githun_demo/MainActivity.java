package com.example.githun_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }


    public void getData(){
        Toast.makeText(this, "This is my first time trying github ", Toast.LENGTH_SHORT).show();
    }

} 