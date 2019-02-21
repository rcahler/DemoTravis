import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

    @Test
    public void CorrectFactorial() {
        assertEquals(120, Factorial.calculate(5));
    }
}
