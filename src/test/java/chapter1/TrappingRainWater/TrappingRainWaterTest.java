package chapter1.TrappingRainWater;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    @Test
    public void solve() {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assert.assertEquals(TrappingRainWater.solve(nums), 6);
    }
}