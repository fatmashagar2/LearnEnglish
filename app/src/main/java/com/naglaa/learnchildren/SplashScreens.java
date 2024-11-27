package com.naglaa.learnchildren;// SplashActivity.java


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreens extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000; // 3 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screens);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreens.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, SPLASH_DELAY);
    }
}
