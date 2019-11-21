package com.ayobami.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);


        // Create a list of Albums and Artist name
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music("American Gangster", "Jay Z"));
        music.add(new Music("African Giant", "Burna Boy"));
        music.add(new Music("The Eminem Show", "Eminem"));
        music.add(new Music("Ready TO Die", "The Notorious B.I.G."));
        music.add(new Music("X", "Ed Sheeran"));
        music.add(new Music("Reasonable Doubt", "Jay Z"));
        music.add(new Music("MMLP2", "Eminem"));
        music.add(new Music("The Black Album", "Jay Z"));
        music.add(new Music("Teflon Don", "Rick Ross"));
        music.add(new Music("Watch The Throne", "Kanye West & Jay Z"));
        music.add(new Music("No Bad Songs", "Kizz Daniel"));
        music.add(new Music("Fire of Zamani", "Ice Prince"));
        music.add(new Music("Late Registration", "Kanye West"));
        music.add(new Music("I Decided", "Big Sean"));
        music.add(new Music("Hood Billionaires", "Rick Ross"));
        music.add(new Music("The Entertainer", "DBanj"));
        music.add(new Music("ANTTI", "Rihanna"));

        MusicAdapter adapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
