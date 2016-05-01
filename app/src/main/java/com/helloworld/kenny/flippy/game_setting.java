package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game_setting extends AppCompatActivity {
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        done = (Button) this.findViewById(R.id.back_button);

        done.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent j = new Intent(game_setting.this, MainActivity.class);
                startActivity(j);
            }
        });
    }
}
