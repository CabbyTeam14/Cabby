package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cabby.R;
import com.example.cabby.databinding.ActivityPassengerMainBinding;

public class PassengerMainActivity extends DrawerPassengerActivity {

    ActivityPassengerMainBinding passengerMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        passengerMainBinding = ActivityPassengerMainBinding.inflate(getLayoutInflater());
        setContentView(passengerMainBinding.getRoot());
        allocateActivityTitle("Home");
    }
}