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
        int[][] matrix2 = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18 ,19 ,20},
                {21, 22, 23, 24, 25}
        };
        List<Integer> solve = SpiralMatrix.solve(matrix);
        Integer[] integers = solve.toArray(new Integer[solve.size()]);
        Assert.assertArrayEquals(integers, new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5});

        List<Integer> solve2 = SpiralMatrix.solve(matrix2);
        Integer[] integers2 = solve2.toArray(new Integer[solve2.size()]);
        Assert.assertArrayEquals(integers2, new Integer[]{1, 2, 3, 4, 5, 10, 15, 20, 25
        , 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13});
    }
}