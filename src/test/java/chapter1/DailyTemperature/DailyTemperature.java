package chapter1.DailyTemperature;

import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(nums);

        System.out.println("===result");
        for(int i : res) {
            System.out.println(i+" ");
        }
    }
    public static int[] dailyTemperatures(int[] temper) {
        // 1
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temper.length];

        // 2
        for(int i = 0; i < temper.length; i++) {
            while(!stack.isEmpty() && temper[stack.peek()] < temper[i]) { // 스택에 값이 있고 스택 값 < 인덱스 값
                int index = stack.pop();
                result[index] = i -index; // 결과값 = 현재인덱스 - 스택에 담겨 있는 인덱스
            }
            stack.push(i);
        }
        return result;
    }
}
