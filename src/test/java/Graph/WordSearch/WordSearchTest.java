package Graph.WordSearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchTest {
    @Test
    public void test1() throws Exception {
        //given
        char[][] grid = {{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};
        String word = "ABCCED";
        //when
        boolean result = WordSearch.solve(grid, word);

        //then
        assertEquals(true, result);
    }

}