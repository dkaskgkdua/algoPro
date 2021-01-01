package QueueAndStack.BaseballGame;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseballGameTest {

    @Test
    public void points() {
        //given
        String[] strs = {"5","-2","4","C","D","9","+","+"};
        //when
        int points = BaseballGame.points(strs);
        //then
        Assert.assertEquals(points, 27);
    }
}