import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void CorrectFactorial() {
        assertEquals(120, Factorial.calculate(5));
    }
}
