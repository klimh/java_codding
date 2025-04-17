package org.krypto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentService {

    public StudentService() {
    }

    public List<Student> wczytajZPliku(String filename) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        File file = new File(filename);

        if(file.exists()) {
            try(Scanner inputFile = new Scanner(file)) {
                if(inputFile.hasNextLine()) {
                    inputFile.nextLine();
                }
                while (inputFile.hasNext()) {
                    String line = inputFile.nextLine();
                    String[] parts = line.split(",");
                    if(parts.length == 3) {
                        String name = parts[0].trim();
                        String surname = parts[1].trim();
                        double av_grade = Double.parseDouble(parts[2].trim());
                        students.add(new Student(name, surname, av_grade));
                    }
                }
            }
        }
        return students;
    }

    public List<Student> sortujMalejacowgSredniej(List<Student> students){
        students.sort((s1,s2)->Double.compare(s2.getAv_grade(),s1.getAv_grade()));
        return students;
    }

    public List<Student> sortujWgImienia(List<Student> students){
        students.sort(Comparator.comparing(Student::getName));
        return students;
    }

    public List<Student> sortujWgNazwiska(List<Student> students){
        students.sort(Comparator.comparing(Student::getSurname));
        return students;
    }

}
