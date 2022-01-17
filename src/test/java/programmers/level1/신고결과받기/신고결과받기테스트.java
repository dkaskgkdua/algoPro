package programmers.level1.신고결과받기;

import org.junit.Assert;
import org.junit.Test;
import programmers.level1.PickTwoAndAdd.PickTwoAndAdd;

public class 신고결과받기테스트 {

    @Test
    public void solution() {
        //given
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        //when
        신고결과받기 test1 = new 신고결과받기();
        int[] solution = test1.solution(id_list, report, 2);

        //then
        int[] result = {2,1,1,0};
        Assert.assertArrayEquals(solution, result);
    }
    @Test
    public void solution2() {
        //given
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        //when
        신고결과받기 test1 = new 신고결과받기();
        int[] solution = test1.solution(id_list, report, 3);

        //then
        int[] result = {0,0};
        Assert.assertArrayEquals(solution, result);
    }
}