package com.example.cabby.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cabby.Adapters.DriverRideAdapter;
import com.example.cabby.Model.Ride;
import com.example.cabby.Tools.Mockup;
import com.example.cabby.databinding.ActivityDriverRideHistoryBinding;

public class DriverRideHistoryActivity extends DrawerDriverActivity {

    ActivityDriverRideHistoryBinding activityDriverRideHistoryBinding;
    ListView listView;
    Intent rideDetailIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDriverRideHistoryBinding = ActivityDriverRideHistoryBinding.
                inflate(getLayoutInflater());
        setContentView(activityDriverRideHistoryBinding.getRoot());
        allocateActivityTitle("Ride History");

        DriverRideAdapter adapter = new DriverRideAdapter(DriverRideHistoryActivity.this);
        listView = activityDriverRideHistoryBinding.driverRideHistoryList;
        listView.setAdapter(adapter);

        rideDetailIntent = new Intent(DriverRideHistoryActivity.this,
                DriverRideDetailsActivity.class);
        addListViewListener();
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

    private void addListViewListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Ride pickedRide = Mockup.getRides().get(i);
                rideDetailIntent.putExtra("ride", pickedRide);
                startActivity(rideDetailIntent);
            }
        });
    }
}