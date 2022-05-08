package programmers.level2.짝지어_제거하기;

import org.junit.Assert;
import org.junit.Test;

public class 짝지어_제거하기Test {
    @Test
    public void test1() {
        // when
        String s = "baabaa";

        // given
        짝지어_제거하기 so1 = new 짝지어_제거하기();
        int result = so1.solution(s);

        // then
        Assert.assertEquals(1, result);
    }
    @Test
    public void test2() {
        // when
        String s = "cdcd";

        // given
        짝지어_제거하기 so1 = new 짝지어_제거하기();
        int result = so1.solution(s);

        // then
        Assert.assertEquals(0, result);
    }
    @Test
    public void test3() {
        // when
        String s = "acdaadca";

        // given
        짝지어_제거하기 so1 = new 짝지어_제거하기();
        int result = so1.solution(s);

        // then
        Assert.assertEquals(1, result);
    }
}
