import org.junit.Test;
import static org.junit.Assert.fail;

public class CalculatorTest {

    @Test
    public void ExceedArguments() {
        Calculator calculator = new Calculator(-100, 100);
        try {
            calculator.add(Calculator.UpperLimit + 1, Calculator.LowerLimit - 1);
            fail("THID_SHOULD_FAIL:_ARGUMENTS_THAT_EXCEED_LIMITS");
        } catch (OverflowException e) {
            // Esto es esperado
        }
    }
}

class Calculator {
    private int _upperLimit;
    private int _lowerLimit;

    public static final int UpperLimit = 100;
    public static final int LowerLimit = -100;

    public Calculator(int lowerLimit, int upperLimit) {
        this._lowerLimit = lowerLimit;
        this._upperLimit = upperLimit;
    }

    public int add(int arg1, int arg2) throws OverflowException {
        if (arg1 > _upperLimit)
            throw new OverflowException("First_argument_exceeds_upper_limit");
        if (arg2 < _lowerLimit)
            throw new OverflowException("Second_argument_exceeds_lower_limit");

        int result = arg1 + arg2;

        if (result > _upperLimit) {
            throw new OverflowException("Upper_limit_exceeded");
        }

        return result;
    }
}

// Definición de la excepción personalizada
class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
