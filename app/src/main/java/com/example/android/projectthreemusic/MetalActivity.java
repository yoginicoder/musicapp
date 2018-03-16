package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Iron Maiden", "Fear of the Dark"));
        songs.add(new Song("Pantera", "Cemetery Gates") );
        songs.add(new Song("Metallica", "Enter Sandman"));
        songs.add(new Song("Guns 'N Roses", "Welcome to the Jungle"));
        songs.add(new Song("Tool","Schism"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
