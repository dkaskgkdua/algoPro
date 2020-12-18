package chapter1.MaximumSubarray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    @Test
    public void test1() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(MaximumSubarray.maxSubArray(nums), 6);
    }
}