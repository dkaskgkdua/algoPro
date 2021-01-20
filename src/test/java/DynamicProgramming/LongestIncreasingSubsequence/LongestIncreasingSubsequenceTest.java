package DynamicProgramming.LongestIncreasingSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void solve() {
        //given
        int[] nums = {1, 2, 3, 2, 5, 2, 6, 10, 4, 12};
        int[] nums2 = {9, 11, 2, 8, 4, 7, 88, 15};
        //when
        int solve = LongestIncreasingSubsequence.solve(nums);
        int solve2 = LongestIncreasingSubsequence.solve(nums2);

        //then
        assertEquals(7, solve);
        assertEquals(4, solve2);
    }
}