package BackTracking.Permutation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void permute_dfs() {
        //given
        int[] input = {1, 2, 3};

        //when
        List<List<Integer>> lists = Permutation.permute_dfs(input);

        List<Integer> expectedItem1 = new ArrayList<>();
        List<Integer> expectedItem2 = new ArrayList<>();
        List<Integer> expectedItem3 = new ArrayList<>();
        List<Integer> expectedItem4 = new ArrayList<>();
        List<Integer> expectedItem5 = new ArrayList<>();
        List<Integer> expectedItem6 = new ArrayList<>();
        expectedItem1.add(1); expectedItem1.add(2); expectedItem1.add(3);
        expectedItem2.add(1); expectedItem2.add(3); expectedItem2.add(2);
        expectedItem3.add(2); expectedItem3.add(1); expectedItem3.add(3);
        expectedItem4.add(2); expectedItem4.add(3); expectedItem4.add(1);
        expectedItem5.add(3); expectedItem5.add(1); expectedItem5.add(2);
        expectedItem6.add(3); expectedItem6.add(2); expectedItem6.add(1);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(expectedItem1);
        expected.add(expectedItem2);
        expected.add(expectedItem3);
        expected.add(expectedItem4);
        expected.add(expectedItem5);
        expected.add(expectedItem6);

        //then
        assertEquals(expected, lists);
    }
}