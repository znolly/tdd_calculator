
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
        return arg1 + arg2;
    }
    
    public int substract(int arg1, int arg2) {
        int res = arg1 - arg2;
        if(arg1>100 || arg1<-100 || arg2>100 || arg2<-100){
            throw new ArithmeticException("Desbordamiento de enteros");
        }
        return res;
    }

}
