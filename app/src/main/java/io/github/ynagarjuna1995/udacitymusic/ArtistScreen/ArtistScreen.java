package io.github.ynagarjuna1995.udacitymusic.ArtistScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import io.github.ynagarjuna1995.udacitymusic.HomeScreen.HomeScreenActivity;
import io.github.ynagarjuna1995.udacitymusic.R;

public class ArtistScreen extends AppCompatActivity implements ArtistScreenContract.IArtistScreenView{

    private ArtistScreenPresenter mArtistScreenPresenter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_screen);
        mArtistScreenPresenter = new ArtistScreenPresenter(this);
        initButtons();

    }
    public void initButtons(){
        setToolbar();
    }

    @Override
    public void setPresenter(ArtistScreenPresenter mArtistScreenPresenter) {
        this.mArtistScreenPresenter = mArtistScreenPresenter;
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
}
