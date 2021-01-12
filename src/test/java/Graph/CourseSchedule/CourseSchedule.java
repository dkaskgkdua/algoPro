package Graph.CourseSchedule;

import java.util.*;

public class CourseSchedule {
    // 나의 풀이
    public static boolean solve(int[][] courses) {
        // 빈값 체크
        if(courses == null || courses.length == 0 || courses[0].length == 0) {
            return false;
        }

        // 오름차순
        Queue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        Set<Integer> set = new HashSet<>();

        // 큐에 담음
        queue.addAll(Arrays.asList(courses));

        // 처음건 세팅해줌
        int[] initValue = queue.poll();
        set.add(initValue[0]);
        set.add(initValue[1]);

        while(!queue.isEmpty()) {
            int[] course = queue.poll();

            // 학습리스트에 선행학습이 있는지 체크 false
            if(!set.contains(course[1])) {
                return false;
            }
            // 순환형식이면(들었던 과목을 또 들으면) false
            if(set.contains(course[0])) {
                return false;
            }
            // 정상 수강하면 수강리스트에 넣음.
            set.add(course[0]);
        }
        return true;
    }
}
