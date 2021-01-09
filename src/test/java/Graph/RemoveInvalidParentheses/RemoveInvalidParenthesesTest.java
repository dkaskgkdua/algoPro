package Graph.RemoveInvalidParentheses;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RemoveInvalidParenthesesTest {

    @Test
    public void removeInvalidParentheses() {
        String s = "(a)())()";
        List<String> strings = RemoveInvalidParentheses.removeInvalidParentheses(s);
        List<String> strings2 = RemoveInvalidParentheses.solve(s);



    }
}