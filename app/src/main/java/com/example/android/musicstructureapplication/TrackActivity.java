package com.example.android.musicstructureapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
Description:
this for the tracks screen. The main purpose is just choosing the track and leading to the "Now playing screen"

 */

public class TrackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        //find the textfield witht the track
        TextView track1 = (TextView) findViewById(R.id.track_1);
        // Set a click listener on that View
        track1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the track View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(TrackActivity.this, PlayingNowActivity.class);
                startActivity(trackIntent);
            }
        });

        //find the textfield witht the track
        TextView track2 = (TextView) findViewById(R.id.track_2);
        // Set a click listener on that View
        track2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the track View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(TrackActivity.this, PlayingNowActivity.class);
                startActivity(trackIntent);
            }
        });

        //find the textfield witht the track
        TextView track3 = (TextView) findViewById(R.id.track_3);
        // Set a click listener on that View
        track3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the track View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(TrackActivity.this, PlayingNowActivity.class);
                startActivity(trackIntent);
            }
        });

        //find the textfield witht the track
        TextView track4 = (TextView) findViewById(R.id.track_4);
        // Set a click listener on that View
        track4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the track View is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(TrackActivity.this, PlayingNowActivity.class);
                startActivity(trackIntent);
            }
        });


    }
}
/*
What should be better, but I do not know how to do it yet.
Here there exactly 4 tracks, but it should be different according to the number of tracks available.
So, the name of the track to find should also be a variable. Ideally, these 4 similar intents should become one

 */