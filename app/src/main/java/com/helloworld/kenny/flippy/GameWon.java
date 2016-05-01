package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameWon extends AppCompatActivity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);

        backButton = (Button) this.findViewById(R.id.back_button);

    }

    public void clickBackButton(View view) {
        Intent i = new Intent(GameWon.this, MainActivity.class);
        startActivity(i);
    }
}
