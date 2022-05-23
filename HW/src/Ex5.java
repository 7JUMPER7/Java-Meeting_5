import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Ex5 {
    public int milligrams;
    
    @Before
    public void before() {
        milligrams = 100000;
    }

    @Test
    public void testAll() {
        assertEquals(100, MassCalculator.toGrams(milligrams), 1e-9);
        assertEquals(0.1, MassCalculator.toKilogram(milligrams), 1e-9);
        assertEquals(0.002, MassCalculator.toCentner(milligrams), 1e-9);
        assertEquals(0.0001, MassCalculator.toTonne(milligrams), 1e-9);
    }
}



class MassCalculator {
    public static double toGrams(double milligrams) {
        return milligrams / 1000;
    }

    public static double toKilogram(double milligrams) {
        return milligrams / 1000000;
    }
    
    public static double toCentner(double milligrams) {
        return milligrams / 50000000;
    }

    public static double toTonne(double milligrams) {
        return milligrams / 1000000000;
    }
}