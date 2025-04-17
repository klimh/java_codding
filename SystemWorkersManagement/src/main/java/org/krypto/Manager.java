package org.krypto;

//class for menago position
public class Manager extends Worker{
    private final double fixedSalary;
    private final double bonuses;

    public Manager(String name,String surname,double fixedSalary,double bonuses){
        super(name,surname);
        this.fixedSalary = fixedSalary;
        this.bonuses = bonuses;
    }

    public double countSalary(){
        return fixedSalary + bonuses;
    }

    public String getPosition() {
        return "Manager";
    }

}
