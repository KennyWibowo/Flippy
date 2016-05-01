package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        backButton = (Button) this.findViewById(R.id.back_button);

        /*backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });*/
    }

    public void clickBackButton(View view) {
        Intent i = new Intent(GameActivity.this, MainActivity.class);
        startActivity(i);
    }
}
