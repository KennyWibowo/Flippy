package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Board {

    private final int LOWER_BOUND = 2;
    private final int UPPER_BOUND = 4;

    private final int LOWER_BOUND_ZEROS = 4;
    private final int UPPER_BOUND_ZEROS = 6;

    private Tile[][] board;
    private int dim;

    public Board(int dim, int level) {
        this.dim = dim;
    }

    private void generateBoard(int dim, int level) {
        board = new Tile[dim][dim];
        int numTiles = dim*dim;
        int max = numTiles/3;

        int lowerBound = (max <= LOWER_BOUND+level ? max : LOWER_BOUND+level);
        int upperBound = (max <= UPPER_BOUND+level ? max : UPPER_BOUND+level);


        int numThrees = randomWithRange(LOWER_BOUND+level, UPPER_BOUND+level);
        int numTwos = randomWithRange(LOWER_BOUND+level,UPPER_BOUND+level);
        int numZeros = randomWithRange(LOWER_BOUND_ZEROS+level,UPPER_BOUND_ZEROS+level);


    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


}
