package com.example.android.musicplayer;
/**
 * {@link Song} represents a song description.
 * It contains a song name and author.
 */
public class Song {
    /** song name*/
    private String mSongName;
    /** author name */
    private String mSongAuthor;

    /**
     * Create a new Song object.
     *
     * @param songName is the song name
     * @param songAuthor is the song author (what a surprise... :)  )
     */
    public Song(String songName, String songAuthor) {
        mSongName = songName;
        mSongAuthor = songAuthor;
    }
    /**
     * Get the song name.
     */
    public String getmSongName() {
        return mSongName;
    }
    /**
     * Get the ... u know what...
     */
    public String getmSongAuthor() {
        return mSongAuthor;
    }
}
