package com.example.android.projectthreemusic;

/**
 * Created by gp on 15/03/2018.
 */


public class Music {

    //artist name
    private String mArtistName;

    //song name
    private String mSongName;

    // create Music object
    public Music(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    //get Artist Name
    public String getArtistName() {
        return mArtistName;
    }

    //get Music Name
    public String getSongName() {
        return mSongName;
    }
}
