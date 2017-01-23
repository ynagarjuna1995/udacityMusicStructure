package io.github.ynagarjuna1995.udacitymusic;

public class MusicList {

    private String mSongName;
    private String mArtistName;
    private int mSongImageResource;

    public MusicList(String mSongName, String mArtistName, int mSongImageResource) {
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
        this.mSongImageResource = mSongImageResource;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmSongImageResource() {
        return mSongImageResource;
    }

}
