package Graph.NumberOfIsland;

import Graph.NumberOfIsland.NumberOfIsland;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandTest {
    @Test
    public void test() {
        // given
        char[][] s = {{'1', '1', '1', '0', '1'}
                     ,{'1', '1', '0', '0', '0'}
                     ,{'1', '1', '0', '0', '1'}
                     ,{'0', '0', '0', '0', '1'}};
        // when
        int solve = NumberOfIsland.solve(s);

        // then
        Assert.assertEquals(solve, 3);

    }

}