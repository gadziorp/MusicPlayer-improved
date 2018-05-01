package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        // Find the View that shows the songlist category
        Button artists = (Button) findViewById(R.id.song);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsIntent = new Intent(ArtistsActivity.this, song_list.class);

                // Start the new activity
                startActivity(artistsIntent);
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
                Intent playlistsFromSongIntent = new Intent(ArtistsActivity.this, MainActivity.class);

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
                Intent artistsFromSongIntent = new Intent(ArtistsActivity.this, PlaylistActivity.class);

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
                Intent searchFromSongIntent = new Intent(ArtistsActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchFromSongIntent);
            }
        });


    }
    }

