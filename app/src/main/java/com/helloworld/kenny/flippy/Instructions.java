package com.helloworld.kenny.flippy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends Activity{
    Button main;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.instructions);

            main = (Button) this.findViewById(R.id.return_button);

            main.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent j = new Intent(Instructions.this, MainActivity.class);
                    startActivity(j);
                }
            });
        }

}
