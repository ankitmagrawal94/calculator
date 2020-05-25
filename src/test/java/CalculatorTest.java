import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void test_inputStringOfNumbers_resultOfAddition() {

        assertEquals(30, Calculator.add("10,20"));

    }

    @Test
    public void test_inputNullInputString_resultOfAdditionShouldZero() {

        assertEquals(0, Calculator.add(""));

    }

}
