package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);



        // Find the View that shows the songlist category
        Button artists = (Button) findViewById(R.id.artists_from_playlists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsFromSongIntent = new Intent(PlaylistActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button main = (Button) findViewById(R.id.main_from_playlist);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsFromSongIntent = new Intent(PlaylistActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(playlistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button playlists = (Button) findViewById(R.id.song_from_playlist);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsFromSongIntent = new Intent(PlaylistActivity.this, song_list.class);

                // Start the new activity
                startActivity(artistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button search = (Button) findViewById(R.id.search_from_playlists);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchFromSongIntent = new Intent(PlaylistActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchFromSongIntent);
            }
        });

    }
}
