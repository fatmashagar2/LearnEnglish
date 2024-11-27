package com.naglaa.learnchildren;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Family extends AppCompatActivity {


    TextView tvFather,tvMother,tvSister,tvBrother,tvGrandFather;
    MediaPlayer musicPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_family);

        tvFather=findViewById(R.id.tv_father);
        tvMother=findViewById(R.id.tv_mother);
        tvSister=findViewById(R.id.tv_sister);
        tvBrother=findViewById(R.id.tv_brother);





        tvFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ensure any previous MediaPlayer instance is released before creating a new one
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Family.this, R.raw.sound_father);
                musicPlayer.start();
            }
        });

        // Repeat similar setup for other TextViews if needed
        tvMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Family.this, R.raw.sound_mother);
                musicPlayer.start();
            }
        });

        tvSister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Family.this, R.raw.sound_sister);
                musicPlayer.start();
            }
        });

        tvBrother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Family
                        .this, R.raw.sound_brother);
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