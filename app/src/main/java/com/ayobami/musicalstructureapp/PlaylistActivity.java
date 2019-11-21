package com.ayobami.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);


        // Create a Playlist with number of songs
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("Most Played", "20"));
        music.add(new Music("Recently Played", "30"));
        music.add(new Music("Favourites", "10"));
        music.add(new Music("Sunday Vibes", "50"));
        music.add(new Music("Long Journey", "150"));
        music.add(new Music("Workout", "40"));
        music.add(new Music("Sleep Playlist", "25"));

        MusicAdapter adapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
