package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.cabby.R;
import com.example.cabby.databinding.ActivityDriverMainBinding;

public class DriverMainActivity extends DrawerDriverActivity {

    ActivityDriverMainBinding driverMainBinding;

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch online_switch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        driverMainBinding = ActivityDriverMainBinding.inflate(getLayoutInflater());
        setContentView(driverMainBinding.getRoot());
        allocateActivityTitle("Home");

        TextView online_text = findViewById(R.id.online_driver_text);
        online_switch = findViewById(R.id.online_driver_switch);
        online_toggle_listener(online_text);

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

    private void online_toggle_listener(TextView online_text){
        online_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (online_switch.isChecked()){
                    online_text.setText(R.string.online_driver);
                    online_switch.setBackground(getDrawable(R.drawable.lightblue_border));
                }
                else {
                    online_text.setText(R.string.offline_driver);
                    online_switch.setBackground(getDrawable(R.drawable.passenger_ride_history_border));
                }
            }
        });
    }
}