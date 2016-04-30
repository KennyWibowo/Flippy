package com.helloworld.kenny.flippy;

/**
 * Created by Kenny on 4/20/2016.
 */
public class Tile {
    private int type; // 0 for voltorb, value card otherwise
    private boolean flipped;

    public Tile(int type) {
        this.type = type;
        this.flipped = false;
    }

    public int getType() {
        return type;
    }

}
