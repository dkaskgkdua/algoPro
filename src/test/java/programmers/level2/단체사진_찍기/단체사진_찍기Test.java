package programmers.level2.단체사진_찍기;

import org.junit.Assert;
import org.junit.Test;

public class 단체사진_찍기Test {
    @Test
    public void case1() {
        // given
        int n = 2;
        String[] data = new String[]{"N~F=0", "R~T>2"};
        // when
        단체사진_찍기 solution = new 단체사진_찍기();
        int result = solution.solution(n, data);

        // then
        Assert.assertEquals(3648, result);
    }
    @Test
    public void case2() {
        // given
        int n = 2;
        String[] data = new String[]{"M~C<2", "C~M>1"};
        // when
        단체사진_찍기 solution = new 단체사진_찍기();
        int result = solution.solution(n, data);

        // then
        Assert.assertEquals(0, result);
    }
    @Test
    public void aCase1() {
        // given
        int n = 2;
        String[] data = new String[]{"M~C<2", "C~M>1"};
        // when
        단체사진_찍기2 solution = new 단체사진_찍기2();
        int result = solution.solution(n, data);

        // then
        Assert.assertEquals(0, result);
    }
    @Test
    public void aCase2() {
        // given
        int n = 2;
        String[] data = new String[]{"N~F=0", "R~T>2"};
        // when
        단체사진_찍기2 solution = new 단체사진_찍기2();
        int result = solution.solution(n, data);

        // then
        Assert.assertEquals(3648, result);
    }
}
