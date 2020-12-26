package chapter1.KthLargestElementInAnArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestElementInAnArrayTest {
    @Test
    public void solve() throws Exception {
        //given
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        //when
        int solve = KthLargestElementInAnArray.solve_array(nums, k);
        int solve2 = KthLargestElementInAnArray.solve_pq(nums, k);
        //then
        Assert.assertEquals(solve, 5);
        Assert.assertEquals(solve2, 5);
    }

}