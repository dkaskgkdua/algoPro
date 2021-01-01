package QueueAndStack.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // 1 짝수가 아닌 값은 false return
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        // 2
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case ')':
                    if(!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    break;
                case ']':
                    if(!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    }
                    break;
                case '}':
                    if(!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }

        return stack.empty();
    }
}
