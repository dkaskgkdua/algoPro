package programmers.level2.카카오프렌즈_컬러링북;

import org.junit.Assert;
import org.junit.Test;
import programmers.level2.더맵게.더맵게;

public class 카카오프렌즈_컬러링북Test {
    @Test
    public void solution1() {
        // given
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int m = 6;
        int n = 4;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{4, 5});

    }
    @Test
    public void solution2() {
        // given
        int[][] picture = {{0, 1, 0}, {1, 1, 0}, {0, 0, 0}};
        int m = 3;
        int n = 3;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{1, 3});

    }
    @Test
    public void solution3() {
        // given
        int[][] picture = {{0, 0}};
        int m = 1;
        int n = 2;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{0, 0});
    }
    @Test
    public void solution4() {
        // given
        int[][] picture = {{1, 0}, {0, 1}};
        int m = 2;
        int n = 2;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{2, 1});
    }
    @Test
    public void solution5() {
        // given
        int[][] picture = {{1, 0, 2}, {0, 1, 2}};
        int m = 2;
        int n = 3;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{3, 2});
    }
    @Test
    public void solution6() {
        // given
        int[][] picture = {{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}
                , {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
                , {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}
                , {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0}
                , {0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0}
                , {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}
                , {0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0}
                , {0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0}
                , {0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0}
                , {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
                , {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
        int m = 13;
        int n = 16;

        // when
        카카오프렌즈_컬러링북 s = new 카카오프렌즈_컬러링북();
        int[] result = s.solution(m, n, picture);
        // then
        Assert.assertArrayEquals(result, new int[]{12, 120});
    }
}
