package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */


public class Song {

    //default translation (any language a user knows / has set / is using)
    private String mArtistName;

    //miwok translation
    private String mSongName;

    // create Song object
    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    //get Artist Name
    public String getArtistName() {
        return mArtistName;
    }

    //get Song Name
    public String getSongName() {
        return mSongName;
    }
}
