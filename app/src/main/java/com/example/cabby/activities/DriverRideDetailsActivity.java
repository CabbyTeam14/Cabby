package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cabby.Model.Ride;
import com.example.cabby.R;

public class DriverRideDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_ride_details);
        initializeData();
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

    private void initializeData(){
        Ride pickedRide = getIntent().getParcelableExtra("ride");
        TextView passengerDetail = findViewById(R.id.passengers_detail);
        TextView fromDetail = findViewById(R.id.driver_from_detail);
        TextView toDetail = findViewById(R.id.driver_to_detail);
        TextView dateDetail = findViewById(R.id.driver_date_detail);
        TextView timeDetail = findViewById(R.id.driver_time_detail);
        TextView carTypeDetail = findViewById(R.id.driver_car_type_detail);

        passengerDetail.setText("1");
        fromDetail.setText(pickedRide.getFrom());
        toDetail.setText(pickedRide.getTo());
        dateDetail.setText(pickedRide.getDate());
        timeDetail.setText(pickedRide.getTime());
        carTypeDetail.setText(pickedRide.getCar_type());
    }
}