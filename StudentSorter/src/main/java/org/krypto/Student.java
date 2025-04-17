package org.krypto;

public class Student {
    private String name;
    private String surname;
    private double av_grade;

    public Student(String name,String surname,double av_grade) {      //constructor
        this.name = name;
        this.surname = surname;
        this.av_grade = av_grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAv_grade() {
        return av_grade;
    }


    //toString zeby byla lepsza czytelnosc = bez hashu zwracana wartosc bedzie
    @Override
    public String toString() {
        return name + " " + surname + " " + av_grade;
    }

}
