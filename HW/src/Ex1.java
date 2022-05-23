import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex1 {
    @Test
    public void triangle() {
        double result = AreaCalculator.Triangle(5, 7);
        assertEquals(17.5, result, 1e-9);
    }
    
    @Test
    public void rectangle() {
        double result = AreaCalculator.Rectangle(5, 7);
        assertEquals(35, result, 1e-9);
    }

    @Test
    public void square() {
        double result = AreaCalculator.Square(5);
        assertEquals(25, result, 1e-9);
    }
    
    @Test
    public void rhombus() {
        double result = AreaCalculator.Rhombus(5, 7);
        assertEquals(35, result, 1e-9);
    }
}



class AreaCalculator {
    public static double Triangle(double a, double h) {
        return 0.5 * a * h;
    }

    public static double Rectangle(double a, double b) {
        return a * b;
    }

    public static double Square(double a) {
        return a * a;
    }

    public static double Rhombus(double a, double h) {
        return a * h;
    }
}