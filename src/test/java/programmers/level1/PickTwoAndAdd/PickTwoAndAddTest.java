package programmers.level1.PickTwoAndAdd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PickTwoAndAddTest {

    @Test
    public void solution() {
        //given
        int[] numbers = {2, 1, 3, 4, 1};

        //when
        int[] solution = PickTwoAndAdd.solution(numbers);

        //then
        int[] result = {2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(solution, result);
    }
    @Test
    public void solution2() {
        //given
        int[] numbers = {5, 0, 2, 7};

        //when
        int[] solution = PickTwoAndAdd.solution(numbers);

        //then
        int[] result = {2, 5, 7, 9, 12};
        Assert.assertArrayEquals(solution, result);
    }
}