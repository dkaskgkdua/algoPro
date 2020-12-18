package chapter1.MaximumSubarray;

/**
 *  Given an interger array nums, find the contiguous
 *  subarray (containing at least one number) which has the
 *  largest sum and return its sum
 */
// subArray 중에 합이 제일 큰 수 return
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int newSum= nums[0];
        int max = nums[0];

        for(int i = 1; i< nums.length; i++) {
            newSum = Math.max(nums[i], newSum+nums[i]);
            max = Math.max(newSum, max);
        }
        return max;
    }
}
