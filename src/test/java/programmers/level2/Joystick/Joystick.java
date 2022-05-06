package programmers.level2.Joystick;

import java.util.ArrayList;
import java.util.List;

/**
 * J E R  O  E N
 * 9 4 9  12 4 13
 *
 * 상하는 아스키코드 활용
 *
 * 좌우는
 * 기본 베이스를 좌에서 우로 순차적으로 쭉 가는 것으로 세팅.
 * 탐색하는 인덱스에서  역으로 갔을 경우 Count
 * -> 기본 베이스와 Count를 Math.min으로 비교해서 최솟값 구함
 */
public class Joystick {
    public static int solution(String name) {
        int answer = 0;

        int len = name.length();

        //최대로 가질 수 있는 min값은 끝까지 가는것
        int min_move = len-1;

        for(int i=0; i<len; i++) {
            // 상하
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            //좌우: 연속된 A의 등장에 따라 최소 움직임이 달라진다
            int next = i+1;// 현재 다음 위치부터
            //내 다음이 A라면 계속 NEXT++
            while(next<len && name.charAt(next) == 'A')
                next++;

            min_move = Math.min(min_move, i + len - next + i);
        }//for

        answer += min_move;

        return answer;
    }

}
