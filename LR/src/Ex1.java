import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ex1 {
    Fraction fraction1;
    Fraction fraction2;

    @Before
    public void before() {
        fraction1 = new Fraction(2, 5);
        fraction2 = new Fraction(3, 8);
    }
    @After
    public void after() {
        fraction1 = null;
        fraction2 = null;
    }

    @Test
    public void summ() {
        Fraction result = fraction1.Summ(fraction2);
        assertEquals(31, result.getNumerator(), 1e-9);
        assertEquals(40, result.getDenominator(), 1e-9);
    }

    @Test
    public void subtract() {
        Fraction result = fraction1.Subtract(fraction2);
        assertEquals(1, result.getNumerator(), 1e-9);
        assertEquals(40, result.getDenominator(), 1e-9);
    }

    @Test
    public void multiply() {
        Fraction result = fraction1.Multiply(fraction2);
        assertEquals(6, result.getNumerator(), 1e-9);
        assertEquals(40, result.getDenominator(), 1e-9);
    }

    @Test
    public void devide() {
        Fraction result = fraction1.Devide(fraction2);
        assertEquals(16, result.getNumerator(), 1e-9);
        assertEquals(15, result.getDenominator(), 1e-9);
    }
}



class Fraction {
    private int Numerator;
    private int Denominator;

    public Fraction() { }
    public Fraction(int numerator, int denominator) {
        Numerator = numerator;
        Denominator = denominator;
    }


    public Fraction Summ(Fraction second) {
//      a/b + c/d = (a*d + b*c)/(b*d)
        Fraction fraction = new Fraction();
        fraction.setNumerator((getNumerator() * second.getDenominator()) + (getDenominator() * second.getNumerator()));
        fraction.setDenominator(getDenominator() * second.getDenominator());
        return fraction;
    }

    public Fraction Subtract(Fraction second) {
//      a/b - c/d = (a*d - b*c)/(b*d)
        Fraction fraction = new Fraction();
        fraction.setNumerator((getNumerator() * second.getDenominator()) - (getDenominator() * second.getNumerator()));
        fraction.setDenominator(getDenominator() * second.getDenominator());
        return fraction;
    }

    public Fraction Multiply(Fraction second) {
//      a/b * c/d = (a*c)/(b*d)
        Fraction fraction = new Fraction();
        fraction.setNumerator(getNumerator() * second.getNumerator());
        fraction.setDenominator(getDenominator() * second.getDenominator());
        return fraction;
    }

    public Fraction Devide(Fraction second) {
//      a/b / c/d = (a*d)/(b*c)
        Fraction fraction = new Fraction();
        fraction.setNumerator(getNumerator() * second.getDenominator());
        fraction.setDenominator(getDenominator() * second.getNumerator());
        return fraction;
    }


    public int getNumerator() {
        return Numerator;
    }
    public void setNumerator(int numerator) {
        Numerator = numerator;
    }

    public int getDenominator() {
        return Denominator;
    }
    public void setDenominator(int denominator) {
        Denominator = denominator;
    }

    @Override
    public String toString() {
        return Numerator + "/" + Denominator;
    }
}
