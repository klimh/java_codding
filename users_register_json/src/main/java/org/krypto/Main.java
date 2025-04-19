package org.krypto;

public class Main {
    public static void main(String[] args) {

    UserRegistry registry = new UserRegistry();
    registry.loadFromFile();

    registry.addUser(new User("John Doe", "john@doe.com"));
    registry.addUser(new User("Bark Lea", "bark@lea.com"));
    registry.addUser(new User("Alex Miqelandzelo","alez@mq.com"));

    registry.printUsers();

    }
}