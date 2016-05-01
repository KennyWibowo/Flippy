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
    private int score;

    public Board(int dim, int level) {
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

        int numZeros = (max <= NUM_ZEROS+level ? max : NUM_ZEROS+level);
        int numThrees = (max <= NUM_THREES+level ? max : NUM_THREES+level);
        int numTwos = (max <= NUM_TWOS+level ? max : NUM_TWOS+level);

        initialize(0, numZeros);
        initialize(3, numThrees);
        initialize(2, numTwos);

        countSums();
        countZeros();
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

    private void countSums() {
        for ( int row = 0; row < dim; row++ ) { // board[row][col]
            int rowsum = 0;
            for ( int col = 0; col < dim; col++ ) {
                rowsum += board[row][col].getType();
            }
            sums[row][0] = rowsum;
        }

        for ( int col = 0; col < dim; col++ ) {
            int colsum = 0;
            for ( int row = 0; row < dim; row++ ) {
                colsum += board[row][col].getType();
            }
            sums[col][1] = colsum;
        }
    }

    private void countZeros() {
        for ( int row = 0; row < dim; row++ ) { // board[row][col]
            int rowzeros = 0;
            for ( int col = 0; col < dim; col++ ) {
                if(board[row][col].getType() == 0) {
                    rowzeros++;
                }
            }
            zeros[row][0] = rowzeros;
        }

        for ( int col = 0; col < dim; col++ ) {
            int colzeros = 0;
            for ( int row = 0; row < dim; row++ ) {
                if(board[row][col].getType() == 0) {
                    colzeros++;
                }
            }
            sums[col][1] = colzeros;
        }
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
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

    public int flipAt(int x, int y) {
        if(!board[x][y].checkFlipped())
            return -1;

        board[x][y].markFlipped();

        score *= board[x][y].getType();

        return board[x][y].getType();
    }

    private void setAt(int x, int y, int type) {
        board[x][y].setType(type);
        allocTable[x][y] = true;
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