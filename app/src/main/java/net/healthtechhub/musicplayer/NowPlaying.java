package net.healthtechhub.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    private TextView songTextView;
    private ImageView playImageView;
    private ImageView nextImageView;
    private ImageView previousImageView;
    private ImageView thumbUpImageView;
    private ImageView thumbDownImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        // Get the intent and song content
        Intent intent = getIntent();
        String songContent = intent.getStringExtra(MainActivity.SONG_CONTENT);

        // Find TextView by ID and set the text
        songTextView = findViewById(R.id.song_content);
        songTextView.setText(songContent);

        // Find ImageVews by ID
        playImageView = findViewById(R.id.play_arrow);
        nextImageView = findViewById(R.id.skip_next);
        previousImageView = findViewById(R.id.skip_previous);
        thumbUpImageView = findViewById(R.id.thumb_up);
        thumbDownImageView = findViewById(R.id.thumb_down);

        // Set onClick Listeners for ImageViews
        playImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to show that ImageView was clicked
                Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT).show();
            }
        });

        nextImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to show that ImageView was clicked
                Toast.makeText(getApplicationContext(),"Next",Toast.LENGTH_SHORT).show();
            }
        });

        previousImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to show that ImageView was clicked
                Toast.makeText(getApplicationContext(),"Previous",Toast.LENGTH_SHORT).show();
            }
        });

        thumbUpImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to show that ImageView was clicked
                Toast.makeText(getApplicationContext(),"Like",Toast.LENGTH_SHORT).show();
            }
        });

        thumbDownImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast to show that ImageView was clicked
                Toast.makeText(getApplicationContext(),"Dislike",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
