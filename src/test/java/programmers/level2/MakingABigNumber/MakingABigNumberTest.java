package programmers.level2.MakingABigNumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakingABigNumberTest {

    @Test
    public void solution() {
        //given
        String number = "1924";
        int k = 2;

        //when
        MakingABigNumber ak = new MakingABigNumber();
        String result = ak.solution(number, k);

        //then
        Assert.assertEquals("94", result);
    }
    @Test
    public void solution2() {
        //given
        String number = "1231234";
        int k = 3;

        //when
        MakingABigNumber ak = new MakingABigNumber();
        String result = ak.solution(number, k);

        //then
        Assert.assertEquals("3234", result);
    }
    @Test
    public void solution3() {
        //given
        String number = "4177252841";
        int k = 4;

        //when
        MakingABigNumber ak = new MakingABigNumber();
        String result = ak.solution(number, k);

        //then
        Assert.assertEquals("775841", result);
    }
}