package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void giveIntformation(View v)
    {
        String button_text;
        button_text =((Button) v).getText().toString();
        if(button_text.equals("How to Play"))
        {
            Intent intent = new Intent(this,Instructions.class);
            startActivity(intent);


        }
    }

}
