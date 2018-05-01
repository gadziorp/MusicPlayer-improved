package com.example.android.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * {@link SongAdapter is an {@link ArrayAdapter} that can provide the layout for song list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View songView = convertView;
        if (songView == null) {
            songView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_song, parent, false);
        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);
// Find the TextView in the activity_song_list.xml layout with the ID songName TextViev.
        TextView songTextView = (TextView) songView.findViewById(R.id.song_text_view);
// Get the song name the currentSong object and set this text on
        // the songTextView.
        songTextView.setText(currentSong.getmSongName());
// Find the TextView in the activity_song_list.xml layout with the ID ArtistName TextViev.
        TextView authorTextView = (TextView) songView.findViewById(R.id.author_text_view);
// Get the song author name the currentSong object and set this text on
        // the authorTextView.
        authorTextView.setText(currentSong.getmSongAuthor());

return songView;

    }
}