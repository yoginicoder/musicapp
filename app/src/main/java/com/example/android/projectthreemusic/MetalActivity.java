package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MetalActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music("Iron Maiden", "Fear of the Dark"));
        songs.add(new Music("Pantera", "Cemetery Gates"));
        songs.add(new Music("Metallica", "Enter Sandman"));
        songs.add(new Music("Guns 'N Roses", "Welcome to the Jungle"));
        songs.add(new Music("Tool", "Schism"));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        /**
         * This code crashes the app
         */
        ImageButton playVar = (ImageButton) findViewById(R.id.play_butt);
        playVar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MetalActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


/**
 * Leave these two braces here
 */
    }

    }









