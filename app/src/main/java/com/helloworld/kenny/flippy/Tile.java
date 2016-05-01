package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Tile{
    private boolean flipped;
    private int type;

    public Tile(int type)
    {
        this.type = type;
        this.flipped = false;
    }

    public void markFlipped(){this.flipped = true;}

    public boolean checkFlipped(){return this.flipped;}

    public int getType(){return this.type;}

    public void setType(int t){this.type = t;}
}
