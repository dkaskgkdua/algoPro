package programmers.level2.NumberOf124Countries;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOf124CountriesTest {
    @Test
    public void test() throws Exception {
        //given
        int num = 5;

        //when
        String s = NumberOf124Countries.solution(5);

        //then
        String result = "12";
        assertEquals(s, result);

    }

}