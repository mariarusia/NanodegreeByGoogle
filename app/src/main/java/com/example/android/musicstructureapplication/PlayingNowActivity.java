package com.example.android.musicstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*Description:
   this is an activity that shows how a now_playing screen would look like

   In the structure version it does basically one thing: once the user presses "home" button, the app returns to the start page
*/

public class PlayingNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        //find the button "home@
        Button home = (Button) findViewById(R.id.home);
        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genret View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlayingNowActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}

/* ToDo
   Here we would an intent that would play audio files, that could look smth like this

   Intent intent = new Intent();
    intent.setAction(android.content.Intent.ACTION_VIEW);
    File file = new File(YOUR_SONG_URI);
    intent.setDataAndType(Uri.fromFile(file), "audio/*");
    startActivity(intent);

   android documentation - https://developer.android.com/guide/components/intents-common.html#Music

   We also must add a listener to the progress bar and the buttons, so the player would rewind, stop or play again if we did smth

 */