package io.github.ynagarjuna1995.udacitymusic.HomeScreen;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import io.github.ynagarjuna1995.udacitymusic.AlbumScreenActivity;
import io.github.ynagarjuna1995.udacitymusic.ArtistScreen.ArtistScreen;
import io.github.ynagarjuna1995.udacitymusic.FavoriteMusicActivity;
import io.github.ynagarjuna1995.udacitymusic.R;
import io.github.ynagarjuna1995.udacitymusic.SongDetailActivity;

public class HomeScreenActivity extends AppCompatActivity implements HomeScreenContract.IHomeScreenView {
    private HomeScreenPresenter mHomeScreenPresenter;
    private Boolean playing =false;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mHomeScreenPresenter = new HomeScreenPresenter(this);
        initButton();
    }

    public void initButton(){
        setToolbar();
        ArtistScreenIntent();
        AlbumScreenIntent();
        songDetailViewButton();
        FavMusicScreenIntent();
        PlayinitButton();

    }

    public void ArtistScreenIntent(){
        CardView ArtistPlaylistCard = (CardView) findViewById(R.id.artist_playlist_card);
        ArtistPlaylistCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistPlaylistIntent = new Intent(getApplicationContext(), ArtistScreen.class);
                startActivity(artistPlaylistIntent);
            }
        });
    }
    public void AlbumScreenIntent(){
        CardView AlbumPlaylistCard = (CardView) findViewById(R.id.album_playlist_card);
        AlbumPlaylistCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumPlaylistIntent = new Intent(getApplicationContext(), AlbumScreenActivity.class);
                startActivity(albumPlaylistIntent);
            }
        });
    }
    public void FavMusicScreenIntent(){
        CardView FavMusiclaylistCard = (CardView) findViewById(R.id.favMusic_playlist_card);
        FavMusiclaylistCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favMusicPlaylistIntent = new Intent(getApplicationContext(), FavoriteMusicActivity.class);
                startActivity(favMusicPlaylistIntent);
            }
        });
    }


    public void setToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.app_logo);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mHomeIntent = new Intent(getApplicationContext(),HomeScreenActivity.class);
                startActivity(mHomeIntent);
            }
        });
    }


    public void PlayinitButton(){
        final ImageButton PlayButtonHomeActivity = (ImageButton) findViewById(R.id.play_home_screen);
        PlayButtonHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   if(playing){
                       PlayButtonHomeActivity.setImageResource(R.drawable.pause);
                       playing = false;
                       Toast.makeText(getApplicationContext(),"Playing",Toast.LENGTH_SHORT).show();
                   }else {
                       PlayButtonHomeActivity.setImageResource(R.drawable.now_play);
                       playing = true;
                       Toast.makeText(getApplicationContext(),"Paused",Toast.LENGTH_SHORT).show();
                   }
            }
        });
    }

    public void songDetailViewButton(){
        final TextView songName = (TextView) findViewById(R.id.songTextHomeScreen);
        songName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sondDetailActivity = new Intent(getApplicationContext(), SongDetailActivity.class);
                startActivity(sondDetailActivity);
            }
        });
    }

    @Override
    public void setPresenter(HomeScreenPresenter mHomeScreenPresenter) {
       this.mHomeScreenPresenter = mHomeScreenPresenter;
    }




}
