package DynamicProgramming.ClimbingStairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void climbStairs() {
        //given
        int n = 4; // 4 번째 계단

        //when
        int stairs = ClimbingStairs.climbStairs(n);

        //then
        assertEquals(5, stairs);
    }
}