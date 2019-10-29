package net.healthtechhub.musicplayer;

/**
 * {@link Song} represents a song that the user wants to play.
 * It contains the title, artist and album art
 */

public class Song {
    private String mArtistName; //Song artist
    private String mSongName; //Song name

    /**
     * Create a new Word object.
     *
     * @param artistName is the artists's name
     * @param songName is the song's name
     *
     */
    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    /**
     * Get the artist's name
     * @return artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song's name
     * @return song name
     */
    public String getSongName() {
        return mSongName;
    }
}
