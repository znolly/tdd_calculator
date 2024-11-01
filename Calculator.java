
/**
 * Write a description of Calculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculator {
    private int lowerLimit;
    private int upperLimit;
    public Calculator(int minValue, int maxValue){
        lowerLimit = minValue;
        upperLimit = maxValue;
    }
    
    
    
    public int add(int arg1, int arg2) {
        if (arg1 > upperLimit) {
            throw new ArithmeticException("First_argument_exceeds_upper_limit");
        }
        
        if (arg2 < lowerLimit) {
            throw new ArithmeticException("Second_argument_exceeds_lower_limit");
        }
        
        int result = arg1 + arg2;
        if (result > upperLimit) {
            throw new ArithmeticException("Upper_limit_exceeded");
        }
        return result;
    }
    
    public int substract(int arg1, int arg2) {
        int res = arg1 - arg2;
        if(res<lowerLimit){
            throw new ArithmeticException("Desbordamiento de enteros");
        }
        return res;
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
