package com.vinothmasilamani;

import java.util.LinkedList;

public class PlayList {

    private String playListName;
    private LinkedList<Song> playListSongs;

    public PlayList(String playListName) {
        this.playListName = playListName;
        playListSongs = new LinkedList<Song>();
    }

    public static boolean addSongToPlayList(PlayList playList, Song song){
        playList.playListSongs.add(song);
        return true;
    }

    public static boolean removeSongFromPlayList(PlayList playList, Song song){
        playList.playListSongs.remove(song);
        return true;
    }

}
