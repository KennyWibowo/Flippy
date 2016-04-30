package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Tile{
    private boolean flipped = false;
    private int type = 0;

    public Tile(int type)
    {
        this.type = type;
    }

    public void markFlipped(){this.flipped = true;}

    public boolean checkFlipped(){return this.flipped;}

    public int getType(){return this.type;}

    public void setType(int t){this.type = t;}
}
