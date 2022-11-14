package com.example.cabby.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.example.cabby.Adapters.DriverRideAdapter;
import com.example.cabby.databinding.ActivityDriverRideHistoryBinding;

public class DriverRideHistoryActivity extends DrawerBaseActivity {

    ActivityDriverRideHistoryBinding activityDriverRideHistoryBinding;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDriverRideHistoryBinding = ActivityDriverRideHistoryBinding.
                inflate(getLayoutInflater());
        setContentView(activityDriverRideHistoryBinding.getRoot());

        DriverRideAdapter adapter = new DriverRideAdapter(DriverRideHistoryActivity.this);
        listView = activityDriverRideHistoryBinding.driverRideHistoryList;
        listView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}