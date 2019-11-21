package com.ayobami.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.music_list);

            // Create a list of Songs
            ArrayList<Music> music = new ArrayList<Music>();
            music.add(new Music("99 Problems", "Jay Z"));
            music.add(new Music("Killin Dem", "Burna Boy"));
            music.add(new Music("Cleaning out my Closet", "Eminem"));
            music.add(new Music("Going back to Cali", "The Notorious B.I.G."));
            music.add(new Music("The A Team", "Ed Sheeran"));
            music.add(new Music("MCHG", "Jay Z"));
            music.add(new Music("Berserk", "Eminem"));
            music.add(new Music("Encore", "Jay Z"));
            music.add(new Music("Free Mason", "Rick Ross"));
            music.add(new Music("Good Morning", "Kanye West"));
            music.add(new Music("Madu", "Kizz Daniel"));
            music.add(new Music("Gimme Dat", "Ice Prince"));
            music.add(new Music("Addiction", "Kanye West"));
            music.add(new Music("Soft Work", "Falz"));
            music.add(new Music("Black & White", "Rick Ross"));
            music.add(new Music("Igwe", "DBanj"));
            music.add(new Music("Umbrella", "Rihanna"));

            MusicAdapter adapter = new MusicAdapter(this, music);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }
}
