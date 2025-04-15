package org.krypto;

public class Logc{

    private Position target;

    public Logc(Position target){
        this.target = target;
    }


    public void checkPosition(int x,int y) {

        if (x < 0 || x > 10 || y < 0 || y > 10) {
            System.out.println("co ty wgl dajesz???");
        }
        else if(x < target.getX()){
            System.out.println("oj chyba w prawo");
            if(y < target.getY()){
                System.out.println("oj chyba w gore");
            }
            else if(y > target.getY()){
                System.out.println("oj chyba w dol");
            }
            else{
                System.out.println("y ok");
            }
        }
        else if(x > target.getX()) {
            System.out.println("oj chyba w lewo");
            if(y < target.getY()){
                System.out.println("oj chyba w gore");
            }
            else if(y > target.getY()){
                System.out.println("oj chyba w dol");
            }
            else{
                System.out.println("y ok");
            }
        }

        else if(x == target.getX()){
            System.out.println("x ok");
            if(y < target.getY()){
                System.out.println("oj chyba w gore");
            }
            else if(y > target.getY()){
                System.out.println("oj chyba w dol");
            }
            else{
                System.out.println("y ok");
                System.out.println("GRATULUJE");
            }
        }
    }


}

