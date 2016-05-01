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
        System.out.println("Board is ready");
        board.printSolution();
        board.printBoard();

        setInfo();
    }
    // 26 - 30: rows
    // 31 - 35: cols
    public void setInfo() {
        Button row1 = (Button) this.findViewById(R.id.button26);
        Button row2 = (Button) this.findViewById(R.id.button27);
        Button row3 = (Button) this.findViewById(R.id.button28);
        Button row4 = (Button) this.findViewById(R.id.button29);
        Button row5 = (Button) this.findViewById(R.id.button30);

        Button col1 = (Button) this.findViewById(R.id.button31);
        Button col2 = (Button) this.findViewById(R.id.button32);
        Button col3 = (Button) this.findViewById(R.id.button33);
        Button col4 = (Button) this.findViewById(R.id.button34);
        Button col5 = (Button) this.findViewById(R.id.button35);

        row1.setText(formatButton(board.getRowSum(0), board.getRowZeros(0)));
        row2.setText(formatButton(board.getRowSum(1), board.getRowZeros(1)));
        row3.setText(formatButton(board.getRowSum(2), board.getRowZeros(2)));
        row4.setText(formatButton(board.getRowSum(3), board.getRowZeros(3)));
        row5.setText(formatButton(board.getRowSum(4), board.getRowZeros(4)));

        col1.setText(formatButton(board.getColSum(0), board.getColZeros(0)));
        col2.setText(formatButton(board.getColSum(1), board.getColZeros(1)));
        col3.setText(formatButton(board.getColSum(2), board.getColZeros(2)));
        col4.setText(formatButton(board.getColSum(3), board.getColZeros(3)));
        col5.setText(formatButton(board.getColSum(4), board.getColZeros(4)));

    }

    private String formatButton(int sum, int zeros) {
        return "Sum: " + sum + "\n0's: " + zeros;
    }

    public void flipTile(View view) {
        int result;

        switch (view.getId()) {
            case (R.id.button1):
                if ((result = board.flipAt(0, 0)) == -1) {
                    System.out.println("Result: " + result);
                    //do nothing
                } else {
                    animateFlip(R.id.button1, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button2):
                if ((result = board.flipAt(0, 1)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button2, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button3):
                if ((result = board.flipAt(0, 2)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button3, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button4):
                if ((result = board.flipAt(0, 3)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button4, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button5):
                if ((result = board.flipAt(0, 4)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button5, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button6):
                if ((result = board.flipAt(1, 0)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button6, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button7):
                if ((result = board.flipAt(1, 1)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button7, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button8):
                if ((result = board.flipAt(1, 2)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button8, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button9):
                if ((result = board.flipAt(1, 3)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button9, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button10):
                if ((result = board.flipAt(1, 4)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button10, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button11):
                if ((result = board.flipAt(2, 0)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button11, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button12):
                if ((result = board.flipAt(2, 1)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button12, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button13):
                if ((result = board.flipAt(2, 2)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button13, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button14):
                if ((result = board.flipAt(2, 3)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button14, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button15):
                if ((result = board.flipAt(2, 4)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button15, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button16):
                if ((result = board.flipAt(3, 0)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button16, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button17):
                if ((result = board.flipAt(3, 1)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button17, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button18):
                if ((result = board.flipAt(3, 2)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button18, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button19):
                if ((result = board.flipAt(3, 3)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button19, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button20):
                if ((result = board.flipAt(3, 4)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button20, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button21):
                if ((result = board.flipAt(4, 0)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button21, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button22):
                if ((result = board.flipAt(4, 1)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button22, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button23):
                if ((result = board.flipAt(4, 2)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button23, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button24):
                if ((result = board.flipAt(4, 3)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button24, "" + result);
                    //flip the tile
                }
                break;
            case (R.id.button25):
                if ((result = board.flipAt(4, 4)) == -1) {
                    //do nothing
                } else {
                    animateFlip(R.id.button25, "" + result);
                    //flip the tile
                }
                break;
        }
    }

    private void animateFlip(int id, String content) {
        if(board.gameOver()) {
            Intent k = new Intent(BoardGame.this, GameOver.class);
            startActivity(k);
        }

        if(board.gameWon()) {
            // route to game won page
        }

        ((Button) this.findViewById(id)).setText(content);
    }
}
