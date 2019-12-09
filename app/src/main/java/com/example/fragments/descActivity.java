package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class descActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        DescFragment descFragment = (DescFragment) getSupportFragmentManager().findFragmentById(R.id.desc_fragment);
        descFragment.setPosition_id(0);
    }
}
