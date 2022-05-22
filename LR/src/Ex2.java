import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class Ex2 {
    public double num1;
    public double num2;

    @Before
    public void before() {
        num1 = 7;
        num2 = 14;
    }

    @Test
    public void summ() {
        double result = Calculator.Summ(num1, num2);
        assertEquals(21, result, 1e-9);
    }

    @Test
    public void sub() {
        double result = Calculator.Sub(num1, num2);
        assertEquals(-7, result, 1e-9);
    }

    @Test
    public void mult() {
        double result = Calculator.Mult(num1, num2);
        assertEquals(98, result, 1e-9);
    }

    @Test
    public void div() {
        try {
            double result = Calculator.Div(num1, num2);
            assertEquals(0.5, result, 1e-9);
        } catch(DivByZeroException ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void divWithException() {
        try {
            double result = Calculator.Div(5, 0);
            assertEquals(0, result, 1e-9);
        } catch(DivByZeroException ex) {
            assertEquals("Division by zero", ex.getMessage());
        }
    }

    @Test
    public void max() {
        try {
            double result = Calculator.Max(num1, num2);
            assertEquals(14, result, 1e-9);
        } catch(EqualNumbersException ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    public void min() {
        try {
            double result = Calculator.Min(num1, num2);
            assertEquals(7, result, 1e-9);
        } catch(EqualNumbersException ex) {
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void maxWithEqualNumbers() {
        try {
            double result = Calculator.Max(5, 5);
            assertEquals(5, result, 1e-9);
        } catch(EqualNumbersException ex) {
            assertEquals("Numbers are equal", ex.getMessage());
        }
    }

    @Test 
    public void percent() {
        double result = Calculator.Percent(num1, num2);
        assertEquals(0.98, result, 1e-9);
    }

    @Test 
    public void pow() {
        double result = Calculator.Pow(num1, 3);
        assertEquals(343, result, 1e-9);
    }
}



class Calculator {
    public static double Summ(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double Sub(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double Mult(double num1, double num2) {
        return num1 * num2;
    }    

    public static double Div(double num1, double num2) throws DivByZeroException {
        if(num2 == 0) {
            throw new DivByZeroException("Division by zero");
        }
        return num1 / num2;
    }

    public static double Max(double num1, double num2) throws EqualNumbersException {
        if(num1 == num2) {
            throw new EqualNumbersException("Numbers are equal");
        }
        return (num1 > num2) ? num1 : num2;
    }

    public static double Min(double num1, double num2) throws EqualNumbersException {
        if(num1 == num2) {
            throw new EqualNumbersException("Numbers are equal");
        }
        return (num1 < num2) ? num1 : num2;
    }

    public static double Percent(double number, double percent) {
        return number * percent / 100;
    }

    public static double Pow(double number, double pow) {
        return Math.pow(number, pow);
    }
}

class DivByZeroException extends Exception {
    public DivByZeroException() { }

    public DivByZeroException(String message) {
        super(message);
    }
}

class EqualNumbersException extends Exception {
    public EqualNumbersException() { }

    public EqualNumbersException(String message) {
        super(message);
    }
}