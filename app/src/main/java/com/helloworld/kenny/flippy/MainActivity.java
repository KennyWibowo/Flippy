package com.helloworld.kenny.flippy;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.memories);
        mySound.setLooping(true);
        mySound.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mySound.release();
        finish();
    }
}
