package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Board
{
    private Tile[][] board;
    private boolean[][] CAT;
    private int[][] sums;

    int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public void printSol(int dim)
    {
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                System.out.print((board[i][j]).getType()+" ");
            }
            System.out.println(sums[i][0]);
        }
        for(int i = 0; i < dim; i++)
        {
            System.out.print(sums[i][1]+" ");
        }
        System.out.println();
    }

    public void printBoard(int dim)
    {
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                if((board[i][j].checkFlipped()))
                {
                    System.out.print((board[i][j]).getType()+" ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println(sums[i][0]);
        }
        for(int i = 0; i < dim; i++)
        {
            System.out.print(sums[i][1]+" ");
        }
        System.out.println();
    }
    public void createBoard(int dim, int level)
    {
        board = new Tile[dim][dim];
        CAT = new boolean[dim][dim];
        sums = new int[dim][2];
        //initialize board to 1
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                board[i][j] = new Tile(1);
                CAT[i][j] = false;
                if (j < 2)
                {
                    sums[i][j] = dim;
                }
            }
        }
        //set 0s
        int numZeros = 6;
        for(int i = 0; i < numZeros; i++)
        {
            int x = randomWithRange(0, dim-1);
            int y = randomWithRange(0, dim-1);
            if (!CAT[x][y])
            {
                board[x][y].setType(0);
                CAT[x][y] = true;
                sums[x][0]+=99;
                sums[y][1]+=99;
            }
            else
            {
                i--;
            }
        }
        //set 3s
        int numThrees = 2;
        for(int i = 0; i < numThrees; i++){
            int x = randomWithRange(0, dim-1);
            int y = randomWithRange(0, dim-1);
            if (!CAT[x][y])
            {
                board[x][y].setType(3);
                CAT[x][y] = true;
                sums[x][0]+=2;
                sums[y][1]+=2;
            }
            else
            {
                i--;
            }
        }
        //set 2s
        int numTwos = 2;
        for(int i = 0; i < numTwos; i++){
            int x = randomWithRange(0, dim-1);
            int y = randomWithRange(0, dim-1);
            if (!CAT[x][y])
            {
                board[x][y].setType(2);
                CAT[x][y] = true;
                sums[x][0]++;
                sums[y][1]++;
            }
            else
            {
                i--;
            }
        }
    }

}