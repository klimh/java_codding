package org.krypto;

import java.util.Random;

public class Position{
    private int x;
    private int y;

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    public static Position createPosition(){
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        int x = rnd.nextInt(11);
        int y = rnd.nextInt(11);
        return new Position(x,y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}
