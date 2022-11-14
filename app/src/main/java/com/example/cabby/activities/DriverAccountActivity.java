package com.example.cabby.activities;

import android.os.Bundle;
import com.example.cabby.R;
import com.example.cabby.databinding.ActivityDriverAccountBinding;

public class DriverAccountActivity extends DrawerDriverActivity {

    ActivityDriverAccountBinding driverAccountBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        driverAccountBinding = ActivityDriverAccountBinding.inflate(getLayoutInflater());
        setContentView(driverAccountBinding.getRoot());
        allocateActivityTitle("Your profile");
    }
}