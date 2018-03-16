package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Nirvana", "Smells Like Teen Spirit"));
        songs.add(new Music("Boston", "More Than a Feeling") );
        songs.add(new Music("Queen", "Bohemian Rhapsody"));
        songs.add(new Music("Deep Purple", "Smoke On The Water"));
        songs.add(new Music("AC/AD","Thunderstruck"));

        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
