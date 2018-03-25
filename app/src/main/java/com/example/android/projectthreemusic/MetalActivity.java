package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class MetalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);


        final ArrayList<Music> songs = new ArrayList<>();

        songs.add(new Music("Iron Maiden", "Fear of the Dark"));
        songs.add(new Music("Pantera", "Cemetery Gates"));
        songs.add(new Music("Metallica", "Enter Sandman"));
        songs.add(new Music("Guns 'N Roses", "Welcome to the Jungle"));
        songs.add(new Music("Tool", "Schism"));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music song = songs.get(position);

                TextView currentSongView = findViewById(R.id.current_song_name_text_view);
                currentSongView.setText(song.getSongName());

                TextView currentArtistView = findViewById(R.id.current_artist_text_view);
                currentArtistView.setText(song.getArtistName());
            }
        });


/**
 * Leave these two braces here
 */
    }

    }









