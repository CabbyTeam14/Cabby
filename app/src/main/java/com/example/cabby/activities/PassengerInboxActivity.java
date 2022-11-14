package com.example.cabby.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.cabby.Adapters.PassengerInboxAdapter;
import com.example.cabby.Adapters.PassengerRideAdapter;
import com.example.cabby.R;


public class PassengerInboxActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.passenger_inbox);

        PassengerInboxAdapter adapter = new PassengerInboxAdapter(PassengerInboxActivity.this);
        listView = findViewById(R.id.passenger_inbox_list);
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