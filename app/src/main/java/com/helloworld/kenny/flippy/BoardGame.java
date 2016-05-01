package com.helloworld.kenny.flippy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kenny on 4/30/2016.
 */
public class BoardGame extends AppCompatActivity {

    Board board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boardgame);

        board = new Board(5, 0);

    }

    public void flipTile(View view) {
        int result;

        switch (view.getId()) {
            case (R.id.button1):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button1, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button2):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button2, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button3):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button3, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button4):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button4, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button5):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button5, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button6):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button6, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button7):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button7, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button8):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button8, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button9):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button9, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button10):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button10, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button11):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button11, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button12):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button12, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button13):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button13, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button14):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button14, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button15):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button15, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button16):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button16, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button17):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button17, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button18):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button18, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button19):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button19, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button20):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button20, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button21):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button21, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button22):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button22, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button23):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button23, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button24):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button24, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button25):
                if ((result = board.flipAt()) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button25, "" + result);
                    //flip the tile
                }
                break;
        }
    }

    private void animateFlip(int id, String content) {
        ((Button) this.findViewById(id)).setText(content);
    }
}
