package junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Evgeniy on 14.07.2017.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divideTest() {
        final int num = 10;
        final int divider = 2;
        final int expected = 5;

        final int actual = calculator.divide(num, divider);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroDividerTest() {
        calculator.divide(10, 0);
    }
}