package chapter1.SpiralMatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SpiralMatrixTest {

    @Test
    public void solve() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> solve = SpiralMatrix.solve(matrix);
        Integer[] integers = solve.toArray(new Integer[solve.size()]);
        Assert.assertArrayEquals(integers, new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5});
    }
}