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
        songs.add(new Song("one", "lutti"));
        songs.add(new Song("two", "otiiko") );
        songs.add(new Song("three", "tolookosu"));
        songs.add(new Song("four", "oyyisa"));
        songs.add(new Song("five","massokka"));
        songs.add(new Song("six", "temmokka"));
        songs.add(new Song("seven", "kenekaku"));
        songs.add(new Song("eight", "kawinta"));
        songs.add(new Song("nine"," wo’e"));
        songs.add(new Song("ten", "na’aacha"));





        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
