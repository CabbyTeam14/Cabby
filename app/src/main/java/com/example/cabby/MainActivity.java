package com.example.cabby;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cabby.Fragments.DriverAccountFragment;
import com.example.cabby.Fragments.PassengerAccountFragment;
import com.example.cabby.Fragments.PassengerInboxFragment;
import com.example.cabby.Fragments.PassengerMainFragment;
import com.example.cabby.Fragments.PassengerRideHistoryFragment;
import com.example.cabby.activities.DrawerBaseActivity;
import com.example.cabby.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends DrawerBaseActivity {
    private String role;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new PassengerMainFragment());
        Intent intent = getIntent();
        role = intent.getStringExtra("role");
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home_item:
                        replaceFragment(new PassengerMainFragment());
                        break;
                    case R.id.inbox_item:
                        replaceFragment(new PassengerInboxFragment());
                        break;
                    case R.id.history_item:
                        replaceFragment(new PassengerRideHistoryFragment());
                        break;
                    case R.id.profile_item:
                        if (role.equals("PASSENGER")){
                            replaceFragment(new PassengerAccountFragment());
                        } else {
                            replaceFragment(new DriverAccountFragment());
                        }

                        break;
                }

                return true;
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_for_fragments, fragment);
        fragmentTransaction.commit();

    }


    @Override
    public void onBackPressed() {

        if (bottomNavigationView.getSelectedItemId() == R.id.home_item){
            AlertDialog.Builder want_to_exit = new AlertDialog.Builder(this);

            want_to_exit.setMessage("Do you want to exit this app?").setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            want_to_exit.show();

        }
        else{
            bottomNavigationView.setSelectedItemId(R.id.home_item);
        }

    }


}