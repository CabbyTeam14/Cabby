package com.example.cabby.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.cabby.R;

public class DrawerPassengerActivity extends DrawerBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_passenger);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(this, PassengerMainActivity.class));
                break;
            case R.id.nav_inbox:
                startActivity(new Intent(this, PassengerInboxActivity.class));
                break;
            case R.id.nav_ride_history:
                startActivity(new Intent(this, PassengerRideHistoryActivity.class));
                break;
            case R.id.nav_profile:
                startActivity(new Intent(this, PassengerAccountActivity.class));
                break;
        }

        return false;
    }
}