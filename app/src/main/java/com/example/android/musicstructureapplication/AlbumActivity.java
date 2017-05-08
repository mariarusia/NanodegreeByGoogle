package com.example.android.musicstructureapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
Description:
the class contains the listeners to the clicks on the textViews with the album name. When that happens it starts the TrackActivity
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        //find the textfield with the first album
        TextView album1 = (TextView) findViewById(R.id.album_1);
        // Set a click listener on that View
        album1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, TrackActivity.class);
                startActivity(albumIntent);
            }
        });

        //find the textfield with the fourth album
        TextView album4 = (TextView) findViewById(R.id.album_4);
        // Set a click listener on that View
        album4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, TrackActivity.class);
                startActivity(albumIntent);
            }
        });

        //find the textfield with the second album
        TextView album2 = (TextView) findViewById(R.id.album_2);
        // Set a click listener on that View
        album2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, TrackActivity.class);
                startActivity(albumIntent);
            }
        });

        //find the textfield with the third album
        TextView album3 = (TextView) findViewById(R.id.album_3);
        // Set a click listener on that View
        album3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(AlbumActivity.this, TrackActivity.class);
                startActivity(albumIntent);
            }
        });
    }
}
/*
What should be better, but I do not know how to do it yet.
Here there exactly 4 albums, but it should be different according to the number of albums available.
So, the name of the album to find should also be a variable. Ideally, these 4 similar intents should become one

 */