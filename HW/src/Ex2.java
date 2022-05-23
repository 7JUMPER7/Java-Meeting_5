import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

public class Ex2 {
    public static int UAH;
    @Before
    public void before() {
        UAH = 150;
    }

    @Test
    public void usd() {
        assertEquals(5, Converter.toUSD(UAH), 1e-9);
    }

    @Test
    public void eur() {
        assertEquals(4.69, Converter.toEUR(UAH), 1e-9);
    }

    @Test
    public void gbp() {
        assertEquals(4.05, Converter.toGBP(UAH), 1e-9);
    }

    @Test
    public void jpy() {
        assertEquals(652.17, Converter.toJPY(UAH), 1e-9);
    }
}



class Converter {
    private static DecimalFormat format = new DecimalFormat("0.##");

    public static double toUSD(double UAH) {
        return Double.parseDouble(format.format(UAH / 30));
    }

    public static double toEUR(double UAH) {
        return Double.parseDouble(format.format(UAH / 32));
    }

    public static double toGBP(double UAH) {
        return Double.parseDouble(format.format(UAH / 37));
    }

    public static double toJPY(double UAH) {
        return Double.parseDouble(format.format(UAH / 0.23));
    }
}