package Graph.CourseSchedule;

import java.util.*;

/**
 * 이번 문제의 핵심은 "위상 정렬"이란 알고리즘 기법임.
 * 1. indegree == 0 인 것을 탐색 (indegree는 노드로 들어오는 선의 갯수)
 * 2. 그 노드와 관련된 edge(선) 제거, indegree  업데이트
 * 3. 1, 2 반복
 * 4. 모든 반복을 끝으로 정렬 완료
 */
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

    public static boolean solve2(int courseNumber, int[][] nums) {
        if(courseNumber <= 0) {
            return false;
        }

        // 1. 그릇, 수강여부를 판단할 inDegree
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[courseNumber];

        int numsLength = nums.length;
        // inDegree에 수강해야할 강의 번호들을 넣음. 그리고 1로 세팅
        for(int i = 0; i < numsLength; i++) {
            inDegree[nums[i][1]]++;
        }

        // 1-2 공간은 4개인데 length만큼 3개가 들어감. 그럼 마지막을 찾음( 0인걸)
        // 뒤에서부터 찾아가는 것임
        for(int i = 0; i <  inDegree.length; i++) {
            if(inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        // 뒤에서부터 큐에 넣어가면서 선수했던 과목인지 체크함
        while(!queue.isEmpty()) {
            int firstZeroVal = queue.poll();
            // nums 탐색
            for(int  i = 0; i < numsLength; i++) {
                // 선수과목과 연결되는지 확인
                if(firstZeroVal == nums[i][0]) {
                    // 연결될 경우 0으로 만듬
                    inDegree[nums[i][1]]--;
                    // 0이 될 경우 queue에 다시 넣음. -1인 경우도 있을 거임
                    if(inDegree[nums[i][1]] ==0) {
                        queue.offer(nums[i][1]);
                    }
                }
            }
        }
        // 0이 아닌 값이 있으면 false (정렬이 안된거)
        for(int i = 0; i <  inDegree.length; i++) {
            if(inDegree[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
