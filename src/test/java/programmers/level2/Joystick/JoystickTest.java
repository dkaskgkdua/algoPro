package programmers.level2.Joystick;

import org.junit.Test;

import static org.junit.Assert.*;

public class JoystickTest {

    @Test
    public void solution() {
        //given
        String name = "JEROEN";

        //when
        int result = Joystick.solution(name);

        //then
        assertEquals(56, result);
    }

    @Test
    public void solution2() {
        //given
        String name = "JAN";

        //when
        int result = Joystick.solution(name);

        //then
        assertEquals(23, result);
    }
    @Test
    public void solution3() {
        //given
        String name = "BBBAAAB";

        //when
        int result = Joystick.solution(name);

        //then
        assertEquals(9, result);
    }
    @Test
    public void solution4() {
        //given
        String name = "ABABAAAAABA";

        //when
        int result = Joystick.solution(name);

        //then
        assertEquals(11, result);
    }
}