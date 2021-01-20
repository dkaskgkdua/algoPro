package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

/**
 * nums : 9, 11, 2, 8, 4, 7, 88, 15
 * dp   : 1  2   1  2  2  3  4   4
 * result : 2    2  2  2  3  4   4
 */
public class LongestIncreasingSubsequence {
    public static int solve(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        // 1
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int result = 1;

        // 2 배열을 한번 돌리고 i번째 값을 기준으로 i보다 작은 j값들과 쭉 비교를 함
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                // 기준값이 뒤에 비교하는 값들보다 큰 경우 값을 + 하고 max값 선택
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
