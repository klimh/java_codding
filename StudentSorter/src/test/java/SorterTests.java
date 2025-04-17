import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.krypto.Student;
import org.krypto.StudentService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SorterTests {

    @Test
    public void wczytanieTest() throws FileNotFoundException {
        StudentService studentService = new StudentService();

        List<Student> expected = List.of(
                new Student("Amelia", "Nowacka", 4.7),
                new Student("Bartosz", "Wieckowski", 3.2)
        );

        List<Student> actual = studentService.wczytajZPliku("danetestowe.csv");

        Assertions.assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i).getName(), actual.get(i).getName());
            Assertions.assertEquals(expected.get(i).getSurname(), actual.get(i).getSurname());
            Assertions.assertEquals(expected.get(i).getAv_grade(), actual.get(i).getAv_grade());
        }
    }
}