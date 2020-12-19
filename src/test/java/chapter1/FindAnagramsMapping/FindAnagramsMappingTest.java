package chapter1.FindAnagramsMapping;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindAnagramsMappingTest {
    @Test
    public void test() {
        int[] A = {11, 27, 45, 31, 50};
        int[] B = {50, 11, 31, 45, 27};

        Assert.assertArrayEquals(FindAnagramsMapping.solve(A,B), new int[] {1, 4, 3, 2, 0});
    }
}