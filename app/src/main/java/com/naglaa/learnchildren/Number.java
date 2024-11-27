package com.naglaa.learnchildren;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Number extends AppCompatActivity {
   TextView tvOne,tvTwo,tvThree,tvFour,tvFive;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_number);
        tvOne=findViewById(R.id.tv_one);
        tvTwo=findViewById(R.id.tv_tow);
        tvThree=findViewById(R.id.tv_three);
        tvFour=findViewById(R.id.tv_four);
        tvFive=findViewById(R.id.tv_five);


        tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ensure any previous MediaPlayer instance is released before creating a new one
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Number.this, R.raw.num_one);
                musicPlayer.start();
            }
        });

        // Repeat similar setup for other TextViews if needed
        tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Number.this, R.raw.num_two);
                musicPlayer.start();
            }
        });

        tvThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Number.this, R.raw.num_three);
                musicPlayer.start();
            }
        });

        tvFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Number.this, R.raw.num_four);
                musicPlayer.start();
            }
        });

        tvFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Number
                        .this, R.raw.num_five);
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
