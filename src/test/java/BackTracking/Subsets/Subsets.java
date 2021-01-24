package BackTracking.Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * 부분집합 문제
 * [1,2,3]
 * [[],[3],[1],[2],[1,2], [1,3], [2,3], [1,2,3]]
 */
public class Subsets {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        List<List<Integer>> subsets = subsets(input);
        System.out.println(subsets);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length ==0) {
            return result;
        }
        dfs(result, list, nums, 0);

        return result;
    }

    private static void dfs(List<List<Integer>> lists, List<Integer> cur, int[] nums, int start) {
        // 1 부분집합이니까 중간경로도 반환값에 넣어줌
        List<Integer> list = new ArrayList<>(cur);
        lists.add(list);

        // 2 부분집합이니까 start 를 +1 씩 해준다. permutation과 조금 다름름
       for(int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            dfs(lists, cur, nums, i+1);
            cur.remove(cur.size()-1);
        }
    }
}
