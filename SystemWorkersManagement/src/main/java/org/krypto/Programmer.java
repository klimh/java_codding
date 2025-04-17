package org.krypto;

//class for programmer position
public class Programmer extends Worker{
    private final int hoursCount;
    private final double hourWage;

    public Programmer(String name, String surname, int hoursCount, double hourWage) {
        super(name, surname);
        this.hoursCount = hoursCount;
        this.hourWage = hourWage;
    }

    public double countSalary() {
        return hourWage * hoursCount;
    }

    public String getPosition() {
        return "Programmer";
    }

}
