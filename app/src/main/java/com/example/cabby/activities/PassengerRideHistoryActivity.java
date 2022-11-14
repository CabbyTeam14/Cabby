package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cabby.Adapters.PassengerRideAdapter;
import com.example.cabby.Model.Ride;
import com.example.cabby.R;
import com.example.cabby.Tools.Mockup;
import com.example.cabby.databinding.ActivityMainBinding;
import com.example.cabby.databinding.ActivityPassengerRideHistoryBinding;

public class PassengerRideHistoryActivity extends DrawerPassengerActivity {

    ActivityPassengerRideHistoryBinding passengerRideHistoryBinding;
    private ListView listView;
    private Intent ride_detail_intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        passengerRideHistoryBinding = ActivityPassengerRideHistoryBinding.
                inflate(getLayoutInflater());
        setContentView(passengerRideHistoryBinding.getRoot());
        allocateActivityTitle("Ride history");

        PassengerRideAdapter adapter = new PassengerRideAdapter(PassengerRideHistoryActivity.this);
        listView = findViewById(R.id.passenger_ride_history_list);
        listView.setAdapter(adapter);
        ride_detail_intent = new Intent(PassengerRideHistoryActivity.this, PassengerRideDetailsActivity.class);
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
                Ride picked_ride = Mockup.getRides().get(i);
                ride_detail_intent.putExtra("ride", picked_ride);
                startActivity(ride_detail_intent);
            }
        });
    }
}