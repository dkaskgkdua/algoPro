package programmers.level2.짝지어_제거하기;

import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s)
    {
        Stack<Character> space = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            Character ca = s.charAt(i);
            if(space.size() > 0 && space.peek() == ca) {
                space.pop();
            } else {
                space.push(ca);
            }
        }

        return space.size() == 0 ? 1 : 0;
    }
}
