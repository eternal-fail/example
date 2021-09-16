package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathematicalOperationsTest {

    @Test
    void computeTest() {
        double[] result = MathematicalOperations.compute(5, 2);

        assertEquals(10, result[0]);
        assertEquals(2.5, result[1]);
        assertEquals(1, result[2]);
    }
}
