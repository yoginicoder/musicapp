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
        songs.add(new Song("Ramones", "Blitzkrieg Bop"));
        songs.add(new Song("Black Flag", "Rise Above") );
        songs.add(new Song("Green Day", "Basket Case"));
        songs.add(new Song("Sex Pistols", "God Save The Queen"));
        songs.add(new Song("Dead Kennedys","Holiday in Cambodia"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}