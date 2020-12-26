package chapter1.KthLargestElementInAnArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    // array로 풀어내는 방법
    public static int solve_array(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        int num = nums[length - k];

        return num;
    }
    // priorityQueue로 풀어내는 방법
    public static int solve_pq(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comp);

        for(int val: nums) {
            pq.offer(val);

            // 기준값인 k보다 크기가 크면 뽑아냄(값 제일 낮은애)
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    static Comparator<Integer> comp = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return a-b;
        }
    };
}
