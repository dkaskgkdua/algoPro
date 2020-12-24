package chapter1.TrappingRainWater;

/**
 *  좌측부터 담을 그릇, 우측부터 담을 그릇을 만들되
 *  각 진행하는 방향으로 max값을 세팅해줌
 */
public class TrappingRainWater {
    public static int solve(int[] height) {
        // 1.
        int result = 0;
        if(height == null || height.length <= 2)  {
            return result;
        }

        int[] left = new int[height.length];
        int[] right = new int[height.length];
        // 2. left
        // max     0, 1, 1, 2, 2, 2
        // height  0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        // left    0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3
        int max = height[0];
        left[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            if(max < height[i]) {
                left[i]= height[i];
                max = height[i];
            } else {
                left[i] = max;
            }
        }

        // 3. right
        // max
        // height 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        // right  3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1
        max = height[height.length-1];
        right[height.length-1] = max;
        for(int i = height.length-2; i >= 0; i--) {
            if(max < height[i]) {
                right[i] = height[i];
                max = height[i];
            } else {
                right[i] = max;
            }

        }
        // 3. left와 right 중 낮은 값을 기준으로 높이를 빼주면 된다.
        for(int i = 0; i < height.length; i++) {
            result += Math.min(left[i], right[i])-height[i];
        }

        return result;
    }
}
