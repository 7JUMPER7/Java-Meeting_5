import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ex4 {
    public Number number;

    @Before
    public void before() {
        number = new Number(5);
    }
    @After
    public void after() {
        number = null;
    }

    @Test
    public void getter() {
        assertEquals(5, number.getNum(), 1e-9);
    }
    
    @Test
    public void setter() {
        int setNum = 7;
        number.setNum(setNum);
        assertEquals(setNum, number.getNum());
    }

    @Test
    public void octa() {
        int shouldBe = Integer.parseInt(Integer.toOctalString(number.getNum()));
        assertEquals(shouldBe, number.toOcta());
    }

    @Test
    public void hex() {
        int shouldBe = Integer.parseInt(Integer.toHexString(number.getNum()));
        assertEquals(shouldBe, number.toHex());
    }

    @Test
    public void binary() {
        int shouldBe = Integer.parseInt(Integer.toBinaryString(number.getNum()));
        assertEquals(shouldBe, number.ToBinary());
    }
}



class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int toOcta() {
        return Integer.parseInt(Integer.toOctalString(this.num));
    }

    public int toHex() {
        return Integer.parseInt(Integer.toHexString(this.num));
    }

    public int ToBinary() {
        return Integer.parseInt(Integer.toBinaryString(this.num));
    }
}