package DynamicProgramming.CoinChange;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        // 그릇
        int max = amount+1;
        int[] dp = new int[max];

        // max로 채웠는데 이는 더미데이터이다.
        // min으로 계산을 하기 때문에 amount 보다 크거나 같으면 된다.
        Arrays.fill(dp, max);
        dp[0] = 0;

        // 2
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                // 현재 기준이 되는 i의 값이 코인값보다 크거나 같을 경우
                if(i >= coins[j]) {
                    // count는 현재 기준이 되는 i에서 코인값을 빼면 나오는 숫자는 이미 구해진 숫자임
                    // 예를 들어 i가 5일 경우 1, 2, 5 코인 순서대로 감하는데 먼저
                    // 1의 경우 5 - 1 = 4가 되고 dp[4]는 도달하기 위한 필요갯수가 구해져있음. 거기에 +1을 해준거임(코인 추가)
                    // 2의 경우 5 - 2 = 3이 되고 dp[3]의 값은 2, 거기에 +1을 해줘서 3이 나옴
                    // 5의 경우 5 - 5 = 0이 되고 dp[0]의 값은 0, 거기에 +1을 해줘서 1이 나옴
                    // 결론은 5를 달성하기 위한 최소의 루트는 5코인 1개를 사용하는 것임. 고로 dp[5] = 1이 됨.
                    // 이런 식으로 뒤로 쭉 가면 11을 구하기 위한 최소의 값이 나옴.
                    int count = dp[i - coins[j]] + 1;
                    dp[i] = Math.min(dp[i], count);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
