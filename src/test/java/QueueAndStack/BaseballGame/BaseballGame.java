package QueueAndStack.BaseballGame;

import java.util.Stack;

/**
 * C의 경우 삭제
 * D의 경우 최상단 것 제곱 후 새로 추가
 *
 * 최종적으로 모두 합한 결과를 리턴턴 * */
public class BaseballGame {
    public static int points(String[] strs) {
        // 1
        Stack<Integer> stack = new Stack<>();

        // 2
        for(String op : strs) {
            switch(op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek()*2);
                    break;
                case "+":
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y);
                    stack.push(x);
                    stack.push(x+y);
                    break;
                default:
                    stack.push(Integer.valueOf(op));
            }
        }
        int sum = 0;
        for(int i : stack) {
            sum += i;
        }
        return sum;
        //return stack.stream().mapToInt(i -> i).sum(); 속도 2배 차이남...
    }
}
