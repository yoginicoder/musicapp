package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;




public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Iron Maiden", "Fear of the Dark"));
        songs.add(new Music("Pantera", "Cemetery Gates") );
        songs.add(new Music("Metallica", "Enter Sandman"));
        songs.add(new Music("Guns 'N Roses", "Welcome to the Jungle"));
        songs.add(new Music("Tool","Schism"));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
