package com.example.cabby;

import android.os.Bundle;

import com.example.cabby.activities.DrawerBaseActivity;
import com.example.cabby.databinding.ActivityMainBinding;

public class MainActivity extends DrawerBaseActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
}