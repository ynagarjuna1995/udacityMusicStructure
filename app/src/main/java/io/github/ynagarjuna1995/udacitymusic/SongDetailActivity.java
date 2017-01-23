package io.github.ynagarjuna1995.udacitymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import io.github.ynagarjuna1995.udacitymusic.HomeScreen.HomeScreenActivity;

public class SongDetailActivity extends AppCompatActivity {
    private Boolean playing = false;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);
        initButtons();
    }

    public void initButtons(){
        PlaySongDetailinitButton();
        setToolbar();
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
    public void PlaySongDetailinitButton(){
        final ImageButton PlayButtonSongDetailActivity = (ImageButton) findViewById(R.id.play_song_detail);
        PlayButtonSongDetailActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing){
                    PlayButtonSongDetailActivity.setImageResource(R.drawable.pause);
                    playing = false;
                    Toast.makeText(getApplicationContext(),"Playing",Toast.LENGTH_SHORT).show();
                }else {
                    PlayButtonSongDetailActivity.setImageResource(R.drawable.now_play);
                    playing = true;
                    Toast.makeText(getApplicationContext(),"Paused",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
