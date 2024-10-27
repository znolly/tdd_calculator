
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

/**
 * Write a description of CalculatorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalculatorTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void test2add2equals4() {
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }
    
    @Test
    public void test2add5equals7() {
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }
    
    @Test
    public void testSubstract5And3Is2() {
        int result = calculator.substract(5, 3);
        assertEquals(2, result);
    }
}
