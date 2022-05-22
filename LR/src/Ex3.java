import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Ex3 {
    public Numbers nums;

    @Before
    public void before() {
        nums = new Numbers(1, 3, 2, 4, 6, 5, 7);
    }

    @Test
    public void summ() {
        int summ = 0;
        for(Integer number : nums.numbers) {
            summ += number;
        }

        assertEquals(summ, nums.Summ(), 1e-9);
    }

    @Test
    public void average() {
        int summ = 0;
        for(Integer number : nums.numbers) {
            summ += number;
        }
        double avg = (double)summ / nums.numbers.size();

        assertEquals(avg, nums.Average(), 1e-9);
    }

    @Test
    public void max() {
        int max = nums.numbers.get(0);
        for(Integer number : nums.numbers) {
            if(number > max) {
                max = number;
            }
        }

        assertEquals(max, nums.Max(), 1e-9);
    }

    @Test
    public void min() {
        int min = nums.numbers.get(0);
        for(Integer number : nums.numbers) {
            if(number < min) {
                min = number;
            }
        }

        assertEquals(min, nums.Min(), 1e-9);
    }
}



class Numbers {
    public List<Integer> numbers;

    public Numbers(Integer... args) {
        numbers = Arrays.asList(args);
    }

    public int Summ() {
        int summ = 0;
        for(Integer number : numbers) {
            summ += number;
        }
        return summ;
    }

    public double Average() {
        int summ = Summ();
        return (double)summ / numbers.size();
    }

    public Integer Max() {
        int max = numbers.get(0);
        for(Integer number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }

    public Integer Min() {
        int min = numbers.get(0);
        for(Integer number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }
}