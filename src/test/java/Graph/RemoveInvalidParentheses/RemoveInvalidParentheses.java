package Graph.RemoveInvalidParentheses;

import java.util.*;

/**
 *  괄호와 일반문자 1개가 포함된 문자열을 받아
 *  괄호가 쌍이 맞는지 확인하는 문제
 *  7문자가 오면 일반문자1개를 제외한 6개의 올바른 쌍을 가진 값들의 List가 반환되어야 함
 *  DFS로 접근
 */
public class RemoveInvalidParentheses {
    public static List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if(s == null) {
            return res;
        }
        // 큐 생성 및 첫번째 값 세팅
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(s);
        visited.add(s);
        boolean found = false;

        //2
        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                // Queue에서 문자를 뽑고 쌍이 맞을 경우  결과그릇에담음
                String str = queue.poll();
                if(isValid(str)) {
                    res.add(str);
                    found = true;
                }
                if(found ) {
                    continue;
                }
                // 0-7 -> 0-6,
                for(int j = 0; j <str.length(); j++) {
                    // 1 일반 문자면 넘김
                    if(str.charAt(j) != '(' && str.charAt(j) != ')') {
                        continue;
                    }

                    // 2
                    String newStr = str.substring(0, j) + str.substring(j+1);
                    if(!visited.contains(newStr)) {
                        queue.offer(newStr);
                        visited.add(newStr);
                    }
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static List<String> solve(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null) {
            return result;
        }

        for(int i = 0; i < s.length(); i++) {
            // newStr 은 i번째 값을 제외한 값임
            String newStr = s.substring(0, i) + s.substring(i + 1);
            // 쌍일 경우와 중복된 값이 아닐 경우를 만족한다면 결과값에반환!
            if(isValid(newStr) && !result.contains(newStr)) {
                result.add(newStr);
            }
        }
        System.out.println(result);
        return result;
    }

    private static boolean isValid(String str) {
        int count = 0;
        for(char c : str.toCharArray()) {
            if( c == '(') {
                count++;
            } else if( c == ')') {
                count--;
                if(count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}
