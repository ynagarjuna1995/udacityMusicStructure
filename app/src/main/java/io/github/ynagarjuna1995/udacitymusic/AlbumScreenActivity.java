package io.github.ynagarjuna1995.udacitymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.github.ynagarjuna1995.udacitymusic.HomeScreen.HomeScreenActivity;

public class AlbumScreenActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ArrayList<MusicList> albumList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_screen);
        initButtons();
    }

    public void initButtons(){
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

}
