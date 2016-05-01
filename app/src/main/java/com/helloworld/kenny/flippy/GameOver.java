package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameOver extends AppCompatActivity {

    Button retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        retry = (Button) this.findViewById(R.id.main_button);
    }

    public void clickMainButton(View view) {
        Intent i = new Intent(GameOver.this, MainActivity.class);
        startActivity(i);
    }
}
