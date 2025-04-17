import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.krypto.Manager;
import org.krypto.Programmer;
import org.krypto.Worker;

public class ProjectTests {

    @Test
    public void countSalaryTest() {
        Worker newWorker = new Programmer("Daniel","Leplawy",182,107.3);
        double expectedSalary = 182*107.3;
        Assertions.assertEquals(expectedSalary,newWorker.countSalary());
    }

    @Test
    public void bonusesTest() {
        Worker newWorker = new Manager("Daniel","Leplawy",9150,1600);
        double expectedSalary = 9150 + 1600;
        Assertions.assertEquals(expectedSalary,newWorker.countSalary());
    }


}