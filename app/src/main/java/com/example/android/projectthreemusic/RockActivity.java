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


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Nirvana", "Smells Like Teen Spirit"));
        songs.add(new Song("Boston", "More Than a Feeling") );
        songs.add(new Song("Queen", "Bohemian Rhapsody"));
        songs.add(new Song("Deep Purple", "Smoke On The Water"));
        songs.add(new Song("AC/AD","Thunderstruck"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
