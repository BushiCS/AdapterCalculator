import org.example.Ints;
import org.example.IntsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Ints intsCalc = new IntsCalculator();

    @Test
    @DisplayName("Тест суммы")
    void sumTest() {
        Assertions.assertEquals(27, intsCalc.sum(15, 12));
    }

    @Test
    @DisplayName("Тест умножения")
    void multTest() {
        Assertions.assertEquals(21, intsCalc.mult(3, 7));
    }

    @Test
    @DisplayName("Тест возведения в степень")
    void powTest() {
        Assertions.assertEquals(243, intsCalc.pow(3, 5));
    }
}
