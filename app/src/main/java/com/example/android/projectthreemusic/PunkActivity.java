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


        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Ramones", "Blitzkrieg Bop"));
        songs.add(new Music("Black Flag", "Rise Above") );
        songs.add(new Music("Green Day", "Basket Case"));
        songs.add(new Music("Sex Pistols", "God Save The Queen"));
        songs.add(new Music("Dead Kennedys","Holiday in Cambodia"));

        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}