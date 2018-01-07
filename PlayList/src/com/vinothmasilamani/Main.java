package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create few songs
        Song song_1 = new Song("Baby Track", "2.5");
        Song song_2 = new Song("Va Pa Pa", "3.2");
        Song song_3 = new Song("Hope Song", "3.5");

        // Create an album and add songs
        Album aruvi = new Album("Aruvi");
        aruvi.addSongToAlbum(song_1);
        aruvi.addSongToAlbum(song_2);
        aruvi.addSongToAlbum(song_3);

        // Creat a playlist and add songs



    }


}
