package com.vinothmasilamani;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songsInAlbum;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        songsInAlbum = new ArrayList<Song>();
    }

    public boolean addSongToAlbum(Song song){
        this.songsInAlbum.add(song);
        return true;
    }


}
