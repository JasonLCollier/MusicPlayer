package net.healthtechhub.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String SONG_CONTENT = "songContent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add songs to ArrayList
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Ed Sheeran", "Perfect"));
        songs.add(new Song("Zedd, Maren Morris & Grey", "The Middle"));
        songs.add(new Song("Maroon 5 feat. Cardi B", "Girls Like You"));
        songs.add(new Song("Tones and I", "Dance Monkey"));
        songs.add(new Song("Maroon 5", "Memories"));
        songs.add(new Song("Shawn Mendes & Camila Cabello", "Señorita"));
        songs.add(new Song("Selena Gomez", "Lose You To Love Me"));
        songs.add(new Song("Lil Nas X feat. Billy Ray Cyrus", "Old Town Road (Remix)"));
        songs.add(new Song("Sam Smith", "How Do You Sleep?"));
        songs.add(new Song("Charlie Puth", "Dangerously"));
        songs.add(new Song("Halsey", "Without Me"));
        songs.add(new Song("Post Malone & Swae Lee", "Sunflower"));
        songs.add(new Song("Chainsmokers feat. Winona Oak", "Hope"));
        songs.add(new Song("Ariana Grande", "God is a Woman"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s.
        SongAdapter adapter = new SongAdapter(this, songs);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        final ListView listView = findViewById(R.id.list_view);
        // Make the {@link ListView} use the {@link SongAdapter}.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Start activity intent with extra song content
                Intent playSongIntent = new Intent(getApplicationContext(), NowPlaying.class);
                Song curSong = (Song) parent.getAdapter().getItem(position);
                String songContent = curSong.getSongName() + "\n" + curSong.getArtistName();
                playSongIntent.putExtra(SONG_CONTENT, songContent);
                startActivity(playSongIntent);
            }
        });

    }
}
