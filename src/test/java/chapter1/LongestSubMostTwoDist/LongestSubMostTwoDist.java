package chapter1.LongestSubMostTwoDist;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {
    public static int solve(String s) {
        // 1
        int start = 0;
        int end = 0;
        int length = 0;
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();

        // 2
        while(s.length()> end) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0)+1); // c= 2, a= 2, b= 3
            if(map.get(endChar) == 1) {
                counter++;
            }
            end++;
            // Map에 담긴 변수가 2개 초과일 경우 빼준다.
            while(counter > 2) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar)-1);
                if(map.get(startChar) == 0) {
                    counter--;
                }
                start++;
            }
            length = Math.max(length, end-start);
        }


        return length;
    }
}
