package BackTracking.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * dfs로 푸는 문제
 * n값이 주어질 경우 ( ) 괄호 쌍이 3개로 딱 맞아 떨어지는 경우의 수를 구하는 것임.
 * dfs로 파고들어서 쌍이 맞는지 체크해서 반환
 */
public class GenerateParentheses {
    public static List<String> generateParentheses_dfs(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n, n, "");
        return result;
    }

    private static void dfs(List<String> result, String str, int left, int right, String str1) {
        System.out.println("str\t"+str+"\t left: " + left + " right: "+ right+ " str1: " + str1);
        // 1 제약조건
        if(left < 0 || left > right) {
            return;
        }

        // 2
        if(left == 0 && right == 0) {
            result.add(str);
            return;
        }
        dfs(result,str+'(', left-1, right, str1+"+");
        dfs(result, str+')', left, right-1, str1+"-");
    }

    /**
     * str		     left: 3 right: 3 str1:
     * str	(	     left: 2 right: 3 str1: +
     * str	((	     left: 1 right: 3 str1: ++
     * str	(((	     left: 0 right: 3 str1: +++
     * str	((((	 left: -1 right: 3 str1: ++++
     * str	((()	 left: 0 right: 2 str1: +++-
     * str	((()(	 left: -1 right: 2 str1: +++-+
     * str	((())	 left: 0 right: 1 str1: +++--
     * str	((())(	 left: -1 right: 1 str1: +++--+
     * str	((()))	 left: 0 right: 0 str1: +++---
     * str	(()	     left: 1 right: 2 str1: ++-
     * str	(()(	 left: 0 right: 2 str1: ++-+
     * str	(()((	 left: -1 right: 2 str1: ++-++
     * str	(()()	 left: 0 right: 1 str1: ++-+-
     * str	(()()(	 left: -1 right: 1 str1: ++-+-+
     * str	(()())	 left: 0 right: 0 str1: ++-+--
     * str	(())	 left: 1 right: 1 str1: ++--
     * str	(())(	 left: 0 right: 1 str1: ++--+
     * str	(())((	 left: -1 right: 1 str1: ++--++
     * str	(())()	 left: 0 right: 0 str1: ++--+-
     * str	(()))	 left: 1 right: 0 str1: ++---
     * str	()	     left: 2 right: 2 str1: +-
     * str	()(	     left: 1 right: 2 str1: +-+
     * str	()((	 left: 0 right: 2 str1: +-++
     * str	()(((	 left: -1 right: 2 str1: +-+++
     * str	()(()	 left: 0 right: 1 str1: +-++-
     * str	()(()(	 left: -1 right: 1 str1: +-++-+
     * str	()(())	 left: 0 right: 0 str1: +-++--
     * str	()()	 left: 1 right: 1 str1: +-+-
     * str	()()(	 left: 0 right: 1 str1: +-+-+
     * str	()()((	 left: -1 right: 1 str1: +-+-++
     * str	()()()	 left: 0 right: 0 str1: +-+-+-
     * str	()())	 left: 1 right: 0 str1: +-+--
     * str	())	     left: 2 right: 1 str1: +--
     * str	)	     left: 3 right: 2 str1: -
     *
     * Process finished with exit code 0
     */
}
