package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cabby.R;

public class DrawerBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_base);
    }
}