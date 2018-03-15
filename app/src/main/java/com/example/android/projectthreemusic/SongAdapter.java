package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gp on 14/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        miwokTextView.setText(currentSong.getSongName());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        defaultTextView.setText(currentSong.getArtistName());


        return listItemView;
    }
}