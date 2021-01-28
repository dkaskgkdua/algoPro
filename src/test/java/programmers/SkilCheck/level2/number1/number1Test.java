package programmers.SkilCheck.level2.number1;

import org.junit.Test;

import static org.junit.Assert.*;

public class number1Test {
    @Test
    public void test1() throws Exception {
        //given
        int n = 5;
        int n2 = 6;
        int n3 = 5000;

        //when
        int s1 = number1.solution(n);
        int s2 = number1.solution(n2);
        int s3 = number1.solution(n3);

        //then
        assertEquals(2, s1);
        assertEquals(2, s2);
        assertEquals(5, s3);
    }

}