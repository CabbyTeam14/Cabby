package com.example.cabby.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.cabby.R;

public class DrawerDriverActivity extends DrawerBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_driver);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(this, DriverMainActivity.class));
                break;
            case R.id.nav_ride_history:
                startActivity(new Intent(this, DriverRideHistoryActivity.class));
                break;
            case R.id.nav_profile:
                startActivity(new Intent(this, DriverAccountActivity.class));
                break;
        }

        return false;
    }
}