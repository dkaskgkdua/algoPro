package QueueAndStack.ValidParentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        //given
        String str = "{[]}";
        String str2 = "()[]{}{";
        //when
        boolean valid = ValidParentheses.isValid(str);
        boolean valid2 = ValidParentheses.isValid(str2);
        //then
        assertTrue(valid);
        assertFalse(valid2);
    }

}