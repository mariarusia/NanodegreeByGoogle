package com.example.android.musicstructureapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/*
Description:
This class contains listeners to the textViews. The listener starts another activity - TrackActivity, where the list of tracks can be found

 */
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);


        //find the textfield with the genre
        TextView rock = (TextView) findViewById(R.id.rock);
        // Set a click listener on that View
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genre View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(GenreActivity.this, TrackActivity.class);
                startActivity(genreIntent);
            }
        });

        //find the textfield with the genre
        TextView hiphop = (TextView) findViewById(R.id.hiphop);
        // Set a click listener on that View
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genre View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(GenreActivity.this, TrackActivity.class);
                startActivity(genreIntent);
            }
        });

        //find the textfield with the genre
        TextView classic = (TextView) findViewById(R.id.classic);
        // Set a click listener on that View
        classic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genret View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(GenreActivity.this, TrackActivity.class);
                startActivity(genreIntent);
            }
        });

        //find the textfield with the genre
        TextView jazz = (TextView) findViewById(R.id.jazz);
        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genret View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(GenreActivity.this, TrackActivity.class);
                startActivity(genreIntent);
            }
        });
    }
}

/*
What should be better, but I do not know how to do it yet.
Here there exactly 4 genres, but it should be different according to the number of genres available.
So, the name of the genre to find should also be a variable. Ideally, these 4 similar intents should become one

 */