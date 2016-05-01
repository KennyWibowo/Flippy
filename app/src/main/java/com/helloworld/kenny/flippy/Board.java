package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Board {

    private final int NUM_ZEROS = 8;
    private final int NUM_TWOS = 2;
    private final int NUM_THREES = 3;

    private Tile [][] board;
    private boolean [][] allocTable;
    private int [][] sums;
    private int [][] zeros;

    private int dim;
    private int score;

    public Board(int dim, int level) {
        System.out.println("Starting board creation...");
        this.board = new Tile[dim][dim];
        this.sums = new int[dim][2];
        this.zeros = new int[dim][2];
        this.allocTable = new boolean[dim][dim];
        this.dim = dim;
        this.score = 1;

        //initialize board to 1
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                board[i][j] = new Tile(1);
                allocTable[i][j] = false;
            }
        }

        int max = (dim*dim)/4;

        int numZeros = (max <= NUM_ZEROS+level ? NUM_ZEROS+level : max);
        int numThrees = (max <= NUM_THREES+level ? NUM_THREES+level : max);
        int numTwos = (max <= NUM_TWOS+level ? NUM_TWOS+level : max);

        System.out.println("Starting initialize...");
        initialize(0, numZeros);
        initialize(3, numThrees);
        initialize(2, numTwos);

        System.out.println("Starting counts...");
        countSums();
        countZeros();
    }

    private void initialize(int type, int amt) {
        for (int i = 0; i < amt; i++) {
            int x = randomWithRange(0, dim - 1);
            int y = randomWithRange(0, dim - 1);
            if (!allocTable[x][y]) {
                board[x][y].setType(type);
                allocTable[x][y] = true;
            } else {
                i--;
            }
        }
    }

    private void countSums() {
        for ( int row = 0; row < dim; row++ ) { // board[row][col]
            for ( int col = 0; col < dim; col++ ) {
                sums[row][0]+= board[row][col].getType();
                sums[col][1]+= board[row][col].getType();
            }
        }
    }

    private void countZeros() {
        for ( int row = 0; row < dim; row++ ) { // board[row][col]
            for ( int col = 0; col < dim; col++ ) {
                if(board[row][col].getType() == 0) {
                    zeros[row][0]++;
                    zeros[col][1]++;
                }
            }
        }
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public void printSolution() {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print((board[i][j]).getType() + "  ");
            }
            System.out.printf("%-2d %-2d\n", sums[i][0], zeros[i][0]);
        }
        for (int i = 0; i < dim; i++) {
            System.out.printf("%-2d ", sums[i][1]);
        }
        System.out.println();
        for (int i = 0; i < dim; i++) {
            System.out.printf("%-2d ", zeros[i][1]);
        }
        System.out.println();
    }

    public void printBoard() {
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

    public int flipAt(int x, int y) {
        if(board[x][y].checkFlipped())
            return -1;

        board[x][y].markFlipped();

        score *= board[x][y].getType();

        return board[x][y].getType();
    }

    public int getRowSum(int row) {
        return sums[row][0];
    }

    public int getColSum(int col) {
        return sums[col][1];
    }

    public int getRowZeros(int row) {
        return zeros[row][0];
    }

    public int getColZeros(int col) {
        return zeros[col][1];
    }

    public int getScore() {
        return score;
    }

    public boolean gameOver() {
        return score == 0;
    }
}