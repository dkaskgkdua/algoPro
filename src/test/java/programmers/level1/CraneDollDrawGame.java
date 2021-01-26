package programmers.level1;

import java.util.Stack;
/**
 * 4, (3, (1, 1), 3), 2, 4
 * (4, (3, (1, 1), 3), (2, 2), 4)
 */
public class CraneDollDrawGame {
    // 나의 풀이
    public static int solution(int[][] board, int[] moves) {
        // 1. 그릇
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // 2.
        // 뽑기 실행
        for(int popIndex = 0; popIndex < moves.length; popIndex++) {
            int pop = moves[popIndex]-1;
            // 각 섹터별(열) 위에서부터(행) 탐색
            for(int height = 0; height < board.length; height++) {
                int target = board[height][pop];
                if(target == 0) {
                    continue;
                }
                // 0이 아니면 뽑았다고 봄
                board[height][pop] = 0;

                // 장바구니의 최상단이 뽑은거랑 같으면 pop, count++2
                if(!stack.isEmpty() && target == stack.peek()) {
                    stack.pop();
                    answer+= 2;
                    break;
                }
                // 다르면 계속 push
                stack.push(target);
                break;
            }
        }
        return answer;
    }
}
