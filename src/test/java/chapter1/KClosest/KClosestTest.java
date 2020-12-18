package chapter1.KClosest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KClosestTest {
    @Test
    public void testKClosest() {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        Assert.assertEquals(KClosest.solve(points, k), new int[][] {{-2,2}});
    }
}