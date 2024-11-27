package com.naglaa.learnchildren;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Colors extends AppCompatActivity {
    TextView tvRed, tvGreen, tvYellow, tvBlue, tvPurble;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colors);

        tvRed = findViewById(R.id.tv_red);
        tvGreen = findViewById(R.id.tv_green);
        tvYellow = findViewById(R.id.tv_yellow);

        tvPurble = findViewById(R.id.tv_purple);

        tvRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ensure any previous MediaPlayer instance is released before creating a new one
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Colors.this, R.raw.red_sound);
                musicPlayer.start();
            }
        });

        // Repeat similar setup for other TextViews if needed
        tvGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Colors.this, R.raw.sound_green);
                musicPlayer.start();
            }
        });

        tvYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Colors.this, R.raw.sound_yellow);
                musicPlayer.start();
            }
        });


        tvPurble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Colors.this, R.raw.purble_sound);
                musicPlayer.start();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (musicPlayer != null) {
            musicPlayer.release();
            musicPlayer = null;
        }
    }
}
