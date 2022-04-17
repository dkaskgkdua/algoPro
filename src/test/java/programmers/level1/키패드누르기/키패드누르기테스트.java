package programmers.level1.키패드누르기;

import org.junit.Assert;
import org.junit.Test;

public class 키패드누르기테스트 {

    @Test
    public void solution() {
        //given
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        //when
        키패드누르기 test1 = new 키패드누르기();
        String result = test1.solution(numbers, hand);

        //then
        String expected = "LRLLLRLLRRL";
        Assert.assertEquals(result, expected);
    }
    @Test
    public void solution2() {
        //given
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        //when
        키패드누르기 test1 = new 키패드누르기();
        String result = test1.solution(numbers, hand);

        //then
        String expected = "LRLLRRLLLRR";
        Assert.assertEquals(result, expected);
    }
    @Test
    public void solution3() {
        //given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        //when
        키패드누르기 test1 = new 키패드누르기();
        String result = test1.solution(numbers, hand);

        //then
        String expected = "LLRLLRLLRL";
        Assert.assertEquals(result, expected);
    }

}