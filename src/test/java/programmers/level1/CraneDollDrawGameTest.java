package programmers.level1;

import org.junit.Test;

import static org.junit.Assert.*;


public class CraneDollDrawGameTest {

    @Test
    public void solution() {
        //given
        int[][] board = {{0, 0, 0, 0, 0},
                         {0, 0, 1, 0, 3},
                         {0, 2, 5, 0, 1},
                         {4, 2, 4, 4, 2},
                         {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        //when
        int solution = CraneDollDrawGame.solution(board, moves);

        //then
        assertEquals(4, solution);
    }
    @Test
    public void solution2() throws Exception {
        //given
        int[][] board = {{0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 3},
                          {0, 2, 5, 0, 1},
                          {4, 2, 4, 4, 2},
                          {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 2, 1, 4};

        //when
        int solution = CraneDollDrawGame.solution(board, moves);

        //then
        assertEquals(8, solution);
    }

}