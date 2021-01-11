package Graph.Mazel;

import org.junit.Test;

import static org.junit.Assert.*;

public class Mazel_DFSTest {
    @Test
    public void hasPath() {
        //given
        int[][] maze ={
                 {0, 0, 1, 0, 0}
                ,{0, 0, 0, 0, 0}
                ,{0, 0, 0, 1, 0}
                ,{1, 1, 0, 1, 1}
                ,{0 ,0, 0, 0, 0}
        };
        int[] start = {0, 4};
        int[] dest = {4, 4};
        int[] dest2 = {3, 2};

        //when
        boolean b = Mazel_DFS.hasPath(maze, start, dest);
        boolean b2 = Mazel_DFS.hasPath(maze, start, dest2);

        //then
        assertTrue(b);
        assertFalse(b2);
    }
}