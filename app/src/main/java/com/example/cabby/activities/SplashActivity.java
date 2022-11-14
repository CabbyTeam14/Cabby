package com.example.cabby.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.cabby.MainActivity;
import com.example.cabby.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        int SPLASH_TIME_OUT = 2000;

        Intent signInIntent = new Intent(SplashActivity.this, SignInActivity.class);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(signInIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
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