package chapter1.PlusOne;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {
    @Test
    public void test1() {
        int[] digits = {1,2,3};
        int[] digits2 = {9, 9, 9};
        int[] digits3 = {9, 8, 9};
        int[] digits4 = {8, 9, 9};
        int[] digits5 = {0, 0};
        int[] digits6 = {2, 1,9,9,9};
        Assert.assertArrayEquals(PlusOne.plusOne(digits),new int[]{1,2,4});
        Assert.assertArrayEquals(PlusOne.plusOne(digits2),new int[]{1,0,0,0});
        Assert.assertArrayEquals(PlusOne.plusOne(digits3),new int[]{9,9,0});
        Assert.assertArrayEquals(PlusOne.plusOne(digits4),new int[]{9,0,0});
        Assert.assertArrayEquals(PlusOne.plusOne(digits5),new int[]{0,1});
        Assert.assertArrayEquals(PlusOne.plusOne(digits6),new int[]{2,2,0,0,0});

    }

}