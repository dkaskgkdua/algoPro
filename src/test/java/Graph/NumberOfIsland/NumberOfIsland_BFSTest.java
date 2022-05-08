package Graph.NumberOfIsland;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIsland_BFSTest {
    @Test
    public void test() throws Exception {
        // given
        char[][] s = {{'1', '1', '1', '0', '1'}
                     ,{'1', '1', '0', '0', '0'}
                     ,{'1', '1', '0', '0', '1'}
                     ,{'0', '0', '0', '0', '1'}};
        // when
        int solve = NumberOfIsland_BFS.solve(s);
        //then
        assertEquals(3, solve);
    }
    @Test
    public void test2() throws Exception {
        // given
        char[][] s = {{'1', '1', '1', '0', '0'}
                     ,{'1', '1', '0', '0', '0'}
                     ,{'1', '1', '0', '0', '0'}
                     ,{'0', '0', '0', '1', '1'}};
        // when
        NumberOfIsland_BFS_RE solution = new NumberOfIsland_BFS_RE();
        int result = solution.solve(s);
        //then
        assertEquals(2, result);
    }
}