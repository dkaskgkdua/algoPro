package programmers.level2.HIndex;

import org.junit.Test;

import static org.junit.Assert.*;

public class HindexTest {

    @Test
    public void solution() {
        //given
        int[] citations = {3, 0, 6, 1, 5};

        //when
        Hindex hi = new Hindex();
        int result = hi.solution(citations);

        //then
        assertEquals(3, result);
    }
}