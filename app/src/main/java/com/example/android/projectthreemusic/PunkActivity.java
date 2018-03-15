package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PunkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("red", "weṭeṭṭi"));
        songs.add(new Song("green", "chokokki") );
        songs.add(new Song("brown", "ṭakaakki"));
        songs.add(new Song("gray", "ṭopoppi"));
        songs.add(new Song("black","kululli"));
        songs.add(new Song("white", "kelelli"));
        songs.add(new Song("dusty yellow", "ṭopiisә"));
        songs.add(new Song("mustard yellow", "chiwiiṭә"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}