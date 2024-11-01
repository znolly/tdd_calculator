
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
        calculator = new Calculator(-100, 100);
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
    public void test2add2equals4() { //Add
        int result = calculator.add(2, 2);
        assertEquals(4, result);
    }
    
    @Test
    public void test2add5equals7() { //AddWithDifferentArguments
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }
    
    @Test
    public void testSubstract5And3Is2() { //Substract
        int result = calculator.substract(5, 3);
        assertEquals(2, result);
    }
    
    @Test
    public void testSubstract3And5IsNeg2() { //SubstractReturningNegative
        int result = calculator.substract(3, 5);
        assertEquals(-2, result);
    }
    
    @Test
     public void testSubstractSettingLimitValues(){ //SubstractSettingLimitValues
       int result = calculator.substract(5, 10);
       assertEquals(-5, result);
    }
    
    @Test
    public void testSubstractExcedingLowerLimit(){ //SubstractExcedingLowerLimit
        Calculator calculator = new Calculator(-100, 100);
        try{
            int result = calculator.substract(10, 150);
            fail("Exception is not being thrown when exceeding lower limit");
        }catch(ArithmeticException e){
            // Ok, the SUT works as expected
        }
    }
    @Test 
    public void testSetUpperLimit() {
        calculator.setUpperLimit(10);
        int result = calculator.getUpperLimit();
        assertEquals(10, result);
    }
    @Test
    public void testSetAndGetLimit() {
        calculator.setUpperLimit(10);
        int result = calculator.getUpperLimit();
        assertEquals(10, result);
        assertEquals(10, calculator.getUpperLimit());
    }
    @Test
    public void addExceedingUpperLimit(){ //SubstractExcedingLowerLimit
        Calculator calculator = new Calculator(-100, 100);
        try{
            int result = calculator.add(10, 150);
            fail("This_should_fail_vía_if_exceeding_upper_limit");
        }catch(ArithmeticException e){
            // Ok, the SUT works as expected
        }
    }
    
    @Test
    public void ExceedArguments() {
        Calculator calculator = new Calculator(-100, 100);
        try {
            calculator.add(calculator.getUpperLimit() + 1, calculator.getLowerLimit() - 1);
            fail("THIS_SHOULD_FAIL:_ARGUMENTS_THAT_EXCEED_LIMITS");
        } catch (ArithmeticException e) {
            // Ok, esto funciona
        }
    }
    
    @Test
    public void ExceedArgumentsInverse() {
        Calculator calculator = new Calculator(-100, 100);
        try {
            calculator.add(calculator.getLowerLimit() - 1, calculator.getUpperLimit() + 1);
            fail("THIS_SHOULD_FAIL_:ARGUMENTS_EXCEEDS_LIMITS");
        } catch (ArithmeticException e) {
            // Ok, this works
        }
    }
    
    @Test
    public void testArgumentsExceedLimitsOnSubtract() {
        Calculator calculator = new Calculator(-100, 100);
        try {
            calculator.substract(calculator.getUpperLimit() + 1, calculator.getLowerLimit() - 1);
            fail("This should fail: arguments exceed limits");
        } catch (ArithmeticException e) { 
            // La excepción se lanzó correctamente, prueba aprobada
        }
    }

}
