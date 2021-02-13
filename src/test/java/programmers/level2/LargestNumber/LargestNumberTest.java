package programmers.level2.LargestNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {

    @Test
    public void solution() {
        //given
        int[] numbers = {6, 10, 2};

        //when
        LargestNumber ln = new LargestNumber();
        String result = ln.solution(numbers);

        //then
        assertEquals("6210", result);
    }

    @Test
    public void solution2() {
        //given
        int[] numbers = {3, 30, 34, 5, 9};

        //when
        LargestNumber ln = new LargestNumber();
        String result = ln.solution(numbers);

        //then
        assertEquals("9534330", result);
    }

    @Test
    public void solution3() {
        //given
        int[] numbers = {0, 0, 0, 0, 0};

        //when
        LargestNumber ln = new LargestNumber();
        String result = ln.solution(numbers);

        //then
        assertEquals("0", result);
    }
}