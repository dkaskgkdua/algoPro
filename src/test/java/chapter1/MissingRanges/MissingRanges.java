package chapter1.MissingRanges;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
        int[] nums = {2,3,5,50,75};
        int lower = 0, upper = 99;
        System.out.println(solve(nums, lower, upper));
    }
    public static List<String> solve(int[] nums, int lower, int upper) {
        // 1.
        List<String> result = new ArrayList<String>();
        if(nums == null || nums.length == 0) {
            return result;
        }

        // 2.
        // - lower부터 배열 첫자리까지 뽑아냄
        if(lower < nums[0]) {
            result.add(makeRange(lower, nums[0]-1));
        }
        // - 2번자리부터 앞뒤자리가 다르고 뒷자리가 더 크면 출력함
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1] && nums[i]+1 < nums[i+1]) {
                result.add(makeRange(nums[i]+1,nums[i+1]-1));
            }
        }
        // - 마지막 자리부터 upper 구간까지 뽑아냄
        if(nums[nums.length-1] <upper) {
            result.add(makeRange(nums[nums.length-1]+1, upper));
        }
        return result;
    }

    public static String makeRange(int low, int high) {
        return low==high ? String.valueOf(low) : (low + "->"+high);
    }
}
