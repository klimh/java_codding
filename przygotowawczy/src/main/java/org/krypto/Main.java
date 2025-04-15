package org.krypto;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Position secret = Position.createPosition();
        Logc logc = new Logc(secret);

        System.out.println("Witaj w grze odgadnijpozycje!");

        int attempt = 0;
        while (true) {
            attempt++;
            System.out.println("Proba " + attempt);
            System.out.println("Podaj X: ");
            int x = sc.nextInt();
            System.out.println("Podaj Y: ");
            int y = sc.nextInt();

            logc.checkPosition(x, y);

            if (x == secret.getX() && y == secret.getY()) {
                break;
            }

        }
    }
}