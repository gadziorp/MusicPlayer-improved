package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        // Find the View that shows the songlist category

        Button artists = (Button) findViewById(R.id.song_from_search);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsIntent = new Intent(SearchActivity.this, song_list.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the songlist category
        Button main = (Button) findViewById(R.id.main_from_search);

        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsFromSongIntent = new Intent(SearchActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(playlistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button playlists = (Button) findViewById(R.id.playlist_from_swarch);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsFromSongIntent = new Intent(SearchActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(artistsFromSongIntent);
            }
        });

        // Find the View that shows the songlist category
        Button search = (Button) findViewById(R.id.artists_from_search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchFromSongIntent = new Intent(SearchActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(searchFromSongIntent);
            }
        });

    }
}
