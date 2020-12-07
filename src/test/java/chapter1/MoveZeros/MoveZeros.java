package chapter1.MoveZeros;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1. 값이 0이 아닌 값을 먼저 array에 담는다.
 * 2. index를 기억한다
 * 3. 해당 index 0인 값을 넣는다
 */
public class MoveZeros {
    public static void main(String[] args) {
        // 1
        int[] nums = {0, 3, 2, 0, 8, 5};
        int index = 0;

        // 2
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        //3
        while(index < nums.length) {
            nums[index++] = 0;
        }

        //4
        Arrays.stream(nums).forEach(System.out::println);
    }
}