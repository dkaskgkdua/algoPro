package chapter1.MeetingRoom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoom2 {
    public static void main(String[] args) {
        // 1. Start time으로 소팅

        // 2. end time으로 소팅 , PriortyQueue MinHeap 사용

        // 3. 앞 End > 뒷.start
        // 회의실 1개 필요
        // 앞.End <= 뒷.start
        // 시간합치기(희의실 필요 없음)
    }
    public int solve(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) {
            return 0;
        }
        // 1. 회의실 예약은 오름차순으로 정렬함(시작시간 기준으로)
        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));

        // 우선순위 큐가 내림차순으로 예약길이만큼 생성
        Queue<Interval> minHeap = new PriorityQueue<>(intervals.length, Comparator.comparingInt(a -> a.end));
        int max = 0;

        // 2. for
        for(int i =0; i<intervals.length; i++) {

            // 큐가 비어있지 않고, (큐에서 우선순위 최상에 있는 것의 종료시간  <= for문으로 돌린 예약의 시작시간) 이면 최상단 노드를 뺌
            // 간단하게 말해서 마지막에 예약된 종료시간보다 새로온 예약의 시작시간이 같거나 크면 미팅룸을 새로 만들 필요가 없음(합친다는 뜻)
            while(!minHeap.isEmpty() && minHeap.peek().end <= intervals[i].start) {
                System.out.println(minHeap.peek().end + " <= " + intervals[i].start);

                intervals[i].start = minHeap.peek().start;
                minHeap.poll();
            }
            // 예약 정보 넣음
            minHeap.offer(intervals[i]);
            minHeap.forEach(System.out::println);
            System.out.println(max + " : " + minHeap.size());
            max = Math.max(max, minHeap.size());
        }

        return max;

    }
}
