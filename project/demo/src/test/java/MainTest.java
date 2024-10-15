import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Main;

public class MainTest {

    Main main = new Main();

    @Test
    public void testPrimeNumbers() {
        int[] primeNumbers = {3,23, 311, 487, 653, 947};
        for (int number : primeNumbers) {
            assertTrue(main.isPrime(number));
        }
    }

    @Test
    public void testEvenNumbers() {
        int[] evenNumbers = {32, 64, 2, 20, 30, 26};
        for (int number : evenNumbers) {
            assertTrue(main.isEven(number));
        }
    }

    @Test
    public void testMultiplesOf23() {
        int[] multiplesOf23 = {23, 46, 115, 184, 207, 230};
        for (int number : multiplesOf23) {
            assertTrue(main.isMultiple(number, 23));
        }
    }
}
