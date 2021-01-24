package BackTracking.Permutation;

import java.util.ArrayList;
import java.util.List;

/** 순열문제 , DFS 문제
 *
 *  input : [1,2,3]
 *  output [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Permutation {
    public static List<List<Integer>> permute_dfs(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }

        dfs(nums, result, list);

        return result;
    }

    private static void dfs(int[] nums, List<List<Integer>> lists, List<Integer> cur) {
        // 1 담는다
        if(cur.size() == nums.length) {
            List<Integer> list = new ArrayList<>(cur);
            lists.add(list);
        }
        // 2 for 저장, 탈출
        for(int i = 0; i <nums.length; i++) {
            // 중복된 것인지 체크
            if(cur.contains(nums[i])) {
                continue;
            }
            cur.add(nums[i]);
            dfs(nums, lists, cur);
            cur.remove(cur.size()-1);
        }
    }
}
