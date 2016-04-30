package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Board {

    private final int NUM_ZEROS = 6;
    private final int NUM_TWOS = 2;
    private final int NUM_THREES = 3;

    private Tile [][] board;
    private boolean [][] allocTable;
    private int [][] sums;
    private int [][] zeros;


    private int dim;

    public Board(int dim, int level) {
        board = new Tile[dim][dim];
        sums = new int[dim][2];
        zeros = new int[dim][2];
        allocTable = new boolean[dim][dim];

        this.dim = dim;

        //initialize board to 1
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                board[i][j] = new Tile(1);
                allocTable[i][j] = false;
            }
        }

        initialize(0, NUM_ZEROS);
        initialize(3, NUM_THREES);
        initialize(2, NUM_TWOS);
    }

    private void initialize(int type, int amt) {
        for (int i = 0; i < amt; i++) {
            int x = randomWithRange(0, dim - 1);
            int y = randomWithRange(0, dim - 1);
            if (allocTable[x][y]) {
                setAt(x, y, type);
            } else {
                i--;
            }
        }
    }


    private void setAt(int x, int y, int type) {
        board[x][y].setType(type);
        allocTable[x][y] = true;
    }

    public void printSolution(int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print((board[i][j]).getType() + " ");
            }
            System.out.println(sums[i][0]);
        }
        for (int i = 0; i < dim; i++) {
            System.out.print(sums[i][1] + " ");
        }
        System.out.println();
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public void printBoard(int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if ((board[i][j].checkFlipped())) {
                    System.out.print((board[i][j]).getType() + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(sums[i][0]);
        }
        for (int i = 0; i < dim; i++) {
            System.out.print(sums[i][1] + " ");
        }
        System.out.println();
    }

    public boolean flipAt(int x, int y) {
        if(!board[x][y].checkFlipped())
            return false;

        board[x][y].markFlipped();

        return true;
    }

}