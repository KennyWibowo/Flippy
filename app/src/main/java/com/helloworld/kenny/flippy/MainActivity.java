package com.helloworld.kenny.flippy;

import android.media.MediaPlayer;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    Button playButton;
    Button settingsButton;
    Button howToButton;

    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) this.findViewById(R.id.play_button);
        settingsButton = (Button) this.findViewById(R.id.settings_button);
        howToButton = (Button) this.findViewById(R.id.instructions_button);

        mySound = MediaPlayer.create(this, R.raw.memories);
        mySound.setLooping(true);
        mySound.start();

    }

    public void clickPlayButton(View view) {
        Intent i = new Intent(MainActivity.this, BoardGame.class);
        startActivity(i);
    }

    public void clickHowToButton(View view) {
        Intent j = new Intent(MainActivity.this, Instructions.class);
        startActivity(j);
    }

    public void clicksettingsButton(View view) {
        Intent k = new Intent(MainActivity.this, game_setting.class);
        startActivity(k);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySound.release();
        finish();
    }
}
