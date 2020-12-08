package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 8, 11, 21};
        int target = 10;
        TwoSum a = new TwoSum();
        int[] result = a.solve(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    //
    public int[] solve(int[] nums, int target) {
        // 담을 그릇
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        // for
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int value = map.get(nums[i]); // i =1일때 8
                result[0] = value+1;
                result[1] = i+1;
            }else {
                map.put(target-nums[i], i); // key 10-2 = 8, value i = 0
            }
        }
        return result;
    }

}
