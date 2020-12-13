package chapter1.JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(solve(J, S));
    }
    public static int solve(String jew, String stone) {
        // jewel 담을 그릇
        Set<Character> set = new HashSet<>();

        for(char jewel : jew.toCharArray()) {
            set.add(jewel); // a, A
        }
        int count = 0;
        for(char stoneChar : stone.toCharArray()) {
            if(set.contains(stoneChar)) {
                count++;
            }
        }

        return count;
    }
}
