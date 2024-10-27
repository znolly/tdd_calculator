
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
    @BeforeEach
    public void setUp() {
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
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result); // Validar que 2 + 2 = 4
    }
    
    @Test
    public void testAddWithDifferentArguments() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }
}
