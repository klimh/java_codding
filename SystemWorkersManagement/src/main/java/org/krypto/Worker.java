package org.krypto;

import java.util.Objects;

//base class
public abstract class Worker implements Rewardable {
    protected String name;
    protected String surname;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Worker)) return false;
        Worker other = (Worker) obj;
        return name.equals(other.name) && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
