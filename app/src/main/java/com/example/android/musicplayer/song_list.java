package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class song_list extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("one", "me"));
        songs.add(new Song("two", "you"));
        songs.add(new Song("three", "he"));
        songs.add(new Song("next", "she"));
        songs.add(new Song("five", "they"));
        songs.add(new Song("another one", "not me"));
        songs.add(new Song("good one", "someone"));
        songs.add(new Song("best", "maybe you?"));
        songs.add(new Song("bad one", "and maybe not"));
        songs.add(new Song("this one", "dunno"));
        songs.add(new Song("that one", "my cat"));
        songs.add(new Song("afdfd one", "it"));
        songs.add(new Song("last", "who cares"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs);

        listView.setAdapter(adapter);


        // Find the View that shows the songlist category
        Button artists = (Button) findViewById(R.id.artists_from_song);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsFromSongIntent = new Intent(song_list.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button main = (Button) findViewById(R.id.main_from_songs);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsFromSongIntent = new Intent(song_list.this, MainActivity.class);

                // Start the new activity
                startActivity(playlistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button playlists = (Button) findViewById(R.id.playlist_from_song);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsFromSongIntent = new Intent(song_list.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(artistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button search = (Button) findViewById(R.id.search_from_song);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchFromSongIntent = new Intent(song_list.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchFromSongIntent);
            }
        });


    }
}

