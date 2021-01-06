package Graph.MaxOfIslands;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxOfIslandsTest {

    @Test
    public void maxAreaOfIsland() {
        // given
        int[][] grid = {{1, 1, 0, 1, 1}
                      , {0, 1, 1, 0, 0}
                      , {0, 0, 0, 0, 0}
                      , {1, 1, 0, 1, 1}
                      , {1, 0, 1, 1, 1}
                      , {1, 0, 1, 1, 1}};
        // when
        int result = MaxOfIslands.maxAreaOfIsland(grid);

        // then
        assertEquals(8, result);
    }
}