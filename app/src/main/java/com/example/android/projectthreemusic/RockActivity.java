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
        songs.add(new Song("father", "әpә"));
        songs.add(new Song("mother", "әṭa") );
        songs.add(new Song("son", "angsi"));
        songs.add(new Song("daughter", "tune"));
        songs.add(new Song("older brother","taachi"));
        songs.add(new Song("younger brother", "chalitti"));
        songs.add(new Song("older sister", "teṭe"));
        songs.add(new Song("younger sister", "kolliti"));
        songs.add(new Song("grandmother", "ama"));
        songs.add(new Song("grandfather", "paapa"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
