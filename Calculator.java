
/**
 * Calculator is an example project from Blé, C. (2020). 
 *     Diseño ágil con TDD, chapter 8.
 * 
 * The Calculator class provides basic arithmetic operations.
 * It sets the argument limits for each operation provided.
 * 
 * @author Team_JavaVerse
 * @version 02-11-24
 */
public class Calculator {
    private int lowerLimit;
    private int upperLimit;
    
    public Calculator(int minValue, int maxValue) {
        lowerLimit = minValue;
        upperLimit = maxValue;
    }
        
    public int add(int arg1, int arg2) {
        validateArgs(arg1, arg2);
        int result = arg1 + arg2;
        
        if (result > upperLimit) {
            throw new ArithmeticException("Upper_limit_exceeded");
        }
        return result;
    }
    
    public int substract(int arg1, int arg2) {
        validateArgs(arg1, arg2);
        int result = arg1 - arg2;
        
        if (result < lowerLimit) {
            throw new ArithmeticException("Lower_limit_exceeded");
        }
        return result;
    }
    
     public boolean validateArgs(int arg1, int arg2) {
        if (arg1 > upperLimit) {
            throw new ArithmeticException("First_argument_exceeds_upper_limit");
        }
        
        if (arg2 < lowerLimit) {
            throw new ArithmeticException("First_argument_exceeds_lower_limit");
        }
        
        if (arg1 < lowerLimit) {
            throw new ArithmeticException("Second_argument_exceeds_lower_limit");
        }
        
        if (arg2 > upperLimit) {
            throw new ArithmeticException("Second_argument_exceeds_upper_limit");
        }
        return true;
    }
    
    public void setUpperLimit(int limit) {
        upperLimit = limit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }
    
    public void setLowerLimit(int limit) {
        lowerLimit = limit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }
}
