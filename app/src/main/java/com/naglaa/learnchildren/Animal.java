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

public class Animal extends AppCompatActivity {
   TextView tvLion,tvCamel,tvGiraffe,tvHorse,tvMonkey;
   MediaPlayer musicPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);
        tvLion=findViewById(R.id.tv_lion);
        tvCamel=findViewById(R.id.tv_Camel);
        tvGiraffe=findViewById(R.id.tv_Giraffe);
        tvHorse=findViewById(R.id.tv_Horse);

        tvLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ensure any previous MediaPlayer instance is released before creating a new one
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Animal.this, R.raw.sound_loin);
                musicPlayer.start();
            }
        });

        // Repeat similar setup for other TextViews if needed
        tvCamel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Animal.this, R.raw.sound_camel);
                musicPlayer.start();
            }
        });

        tvGiraffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Animal.this, R.raw.sound_girraf);
                musicPlayer.start();
            }
        });

        tvHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musicPlayer != null) {
                    musicPlayer.release();
                }
                musicPlayer = MediaPlayer.create(Animal.this, R.raw.sound_horse);
                musicPlayer.start();
            }
        });


    }
}