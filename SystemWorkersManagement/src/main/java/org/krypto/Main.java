package org.krypto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Programmer("Kamil","Maly",178,95));
        workers.add(new Programmer("Hubert","Lewandowski",192,110));
        workers.add(new Programmer("Kacper","Opacko",132,98));
        workers.add(new Programmer("Marcin","Rzebicki",151,102));
        workers.add(new Programmer("Mateusz","Srebrzynski",123,124));
        workers.add(new Programmer("Nikodem","Nikscin",211,100));
        workers.add(new Programmer("Kiril","Kutsenko",132,98.5));
        workers.add(new Programmer("Vladyslav","Limanenko",182,107.3));

        workers.add(new Manager("Daniel","Leplawy",9150,1600));
        double suma = 0;
        for (Worker w : workers) {
            System.out.println(w + " - salary: "+ w.countSalary());
            suma += w.countSalary();
        }
        System.out.println("Costs of running a business: " + suma + "\n");

        System.out.println("Top Earners due to salary sorted in descending order: ");
        workers.stream()
                .sorted(Comparator.comparing(Rewardable::countSalary).reversed())
                .forEach(w -> System.out.println(w + " - salary: "+ w.countSalary()));
    }
}