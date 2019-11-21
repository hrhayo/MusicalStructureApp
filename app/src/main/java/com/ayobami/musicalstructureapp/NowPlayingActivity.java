package com.ayobami.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        ImageView play = findViewById(R.id.image_play);
        ImageView rewind = findViewById(R.id.image_rewind);
        ImageView fast = findViewById(R.id.image_fast);
        ImageView like = findViewById(R.id.image_like);
        ImageView repeat = findViewById(R.id.image_repeat);



    }



}
