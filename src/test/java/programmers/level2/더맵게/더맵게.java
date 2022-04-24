package programmers.level2.더맵게;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int returnValue = 0;
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        while(!queue.isEmpty()) {
            int firstValue = queue.poll();
            if(firstValue < K) {
                int secondValue = queue.poll();
                int mixValue = mixScobil(firstValue, secondValue);
                if(mixValue < K && queue.isEmpty()) {
                    queue.clear();
                    returnValue = -1;
                } else {
                    queue.add(mixValue);
                    returnValue++;
                }

            } else {
                queue.clear();
            }
        }
        return returnValue;
    }

    public int mixScobil(int first, int second) {
        return first + (second * 2);
    }
}
