package BackTracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    @Test
    public void test() throws Exception {
        //given
        int n = 3;

        //when
        List<String> strings = GenerateParentheses.generateParentheses_dfs(3);

        //then
        String a1 = "((()))", a2 = "(()())", a3 = "(())()", a4 = "()(())", a5 = "()()()";
        List<String> list = new ArrayList<>();
        list.add(a1); list.add(a2); list.add(a3); list.add(a4); list.add(a5);

        assertEquals(list, strings);
    }

}