package com.ayobami.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find view that show the music app activities
        TextView nowPlaying = findViewById(R.id.now_playing);
        TextView songs = findViewById(R.id.songs);
        TextView albums = findViewById(R.id.albums);
        TextView playlist = findViewById(R.id.playlist);

        // Set a click listener on that View
        if (nowPlaying != null) {
            nowPlaying.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                    startActivity(nowPlayingIntent);
                }
            });
        }
        // Set the content of the activity to use the activity_main.xml layout file


        // Set a click listener on that View
        if (songs != null) {
            songs.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                    startActivity(songsIntent);
                }
            });
        }

        // Set a click listener on that View
        if (albums != null) {
            albums.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                    startActivity(albumsIntent);
                }
            });
        }

        // Set a click listener on that View
        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                    startActivity(playlistIntent);
                }
            });
        }

    }

}
