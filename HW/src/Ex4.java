import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Ex4 {
    public int millimeters;
    
    @Before
    public void before() {
        millimeters = 100000;
    }

    @Test
    public void testAll() {
        assertEquals(10000, LengthCalculator.toCentimeters(millimeters), 1e-9);
        assertEquals(1000, LengthCalculator.toDecimeters(millimeters), 1e-9);
        assertEquals(100, LengthCalculator.toMeters(millimeters), 1e-9);
        assertEquals(0.1, LengthCalculator.toKilometers(millimeters), 1e-9);
    }
}



class LengthCalculator {
    public static double toCentimeters(double millimeters) {
        return millimeters / 10;
    }

    public static double toDecimeters(double millimeters) {
        return millimeters / 100;
    }
    
    public static double toMeters(double millimeters) {
        return millimeters / 1000;
    }

    public static double toKilometers(double millimeters) {
        return millimeters / 1000000;
    }
}