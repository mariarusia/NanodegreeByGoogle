package com.example.android.musicstructureapplication;

/*
Description:
the class contains listeners to the clicks of the textFields with the artists name. It then starts an activity witht the list of tracks
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        //find the textfield with the first artist
        TextView artist1 = (TextView) findViewById(R.id.artist_1);
        // Set a click listener on that View
        artist1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistActivity.this, TrackActivity.class);
                startActivity(artistIntent);
            }
        });

        //find the textfield with the first artist
        TextView artist2 = (TextView) findViewById(R.id.artist_2);
        // Set a click listener on that View
        artist2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistActivity.this, TrackActivity.class);
                startActivity(artistIntent);
            }
        });

        //find the textfield with the first artist
        TextView artist3 = (TextView) findViewById(R.id.artist_3);
        // Set a click listener on that View
        artist3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistActivity.this, TrackActivity.class);
                startActivity(artistIntent);
            }
        });

        //find the textfield with the first artist
        TextView artist4 = (TextView) findViewById(R.id.artist_4);
        // Set a click listener on that View
        artist4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistActivity.this, TrackActivity.class);
                startActivity(artistIntent);
            }
        });
    }

}
/*
What should be better, but I do not know how to do it yet.
Here there exactly 4 artists, but it should be different according to the number of artists available.
So, the name of the artist to find should also be a variable. Ideally, these 4 similar intents should become one

 */