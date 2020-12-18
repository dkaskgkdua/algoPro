package chapter1.LongestSubMostTwoDist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubMostTwoDistTest {

    @Test
    public void solve() {
        String s = "ccaabbb";
        String s2 = "ccaaaaabbb";

        //Assert.assertEquals(LongestSubMostTwoDist.solve(s),5);
        Assert.assertEquals(LongestSubMostTwoDist.solve(s2),8);
    }
}