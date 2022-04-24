package programmers.level2.더맵게;

import junit.framework.Assert;
import org.junit.Test;

public class 더맵게Test {
    @Test
    public void solution1() {
        // given
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        // when
        더맵게 s = new 더맵게();
        int result = s.solution(scoville, 7);
        // then
        Assert.assertEquals(2, result);
    }
    @Test
    public void solution2() {
        // given
        int[] scoville = {1, 2};
        int K = 7;
        // when
        더맵게 s = new 더맵게();
        int result = s.solution(scoville, 7);
        // then
        Assert.assertEquals(-1, result);
    }
}
