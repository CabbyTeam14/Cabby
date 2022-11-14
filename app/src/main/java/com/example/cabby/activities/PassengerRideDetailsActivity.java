package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cabby.Model.Ride;
import com.example.cabby.R;

public class PassengerRideDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_ride_details);
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
        Ride picked_ride = getIntent().getParcelableExtra("ride");
        TextView driver_detail = findViewById(R.id.passenger_driver_detail);
        TextView from_detail = findViewById(R.id.passenger_from_detail);
        TextView to_detail = findViewById(R.id.passenger_to_detail);
        TextView date_detail = findViewById(R.id.passenger_date_detail);
        TextView time_detail = findViewById(R.id.passenger_time_detail);
        TextView car_type_detail = findViewById(R.id.passenger_car_type_detail);

        driver_detail.setText(picked_ride.getDriver());
        from_detail.setText(picked_ride.getFrom());
        to_detail.setText(picked_ride.getTo());
        date_detail.setText(picked_ride.getDate());
        time_detail.setText(picked_ride.getTime());
        car_type_detail.setText(picked_ride.getCar_type());
    }
}