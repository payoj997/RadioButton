package com.example.p66na.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import static com.example.p66na.radiobutton.R.color.colorAccent;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rgrp);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rblue: layout.setBackgroundColor(Color.parseColor("#3498DB"));
                    break;
                    case R.id.rgreen: layout.setBackgroundColor(Color.parseColor("#45CE30"));
                    break;
                    case R.id.ryellow: layout.setBackgroundColor(Color.parseColor("#FFF222"));
                }
            }
        });
    }
}
