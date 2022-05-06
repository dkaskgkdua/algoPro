package programmers.level2.카카오프렌즈_컬러링북;

import java.util.*;

public class 카카오프렌즈_컬러링북 {

    static int[][] dirs;

    public static int[] solution(int m, int n, int[][] picture) {

        dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] arr = new int[m][n];
        copy(picture, arr, m, n);
        int areaCount = 0;
        int maxCount = 0;

        for(int x = 0; x < arr.length; x++) {
            for(int y = 0; y < arr[0].length; y++) {
                if(arr[x][y] != 0) {
                    areaCount++;
                    maxCount = Math.max(dfs(arr, x, y, m, n, arr[x][y], 0), maxCount);
                }
            }
        }
        return new int[]{ areaCount, maxCount };
    }

    public static int dfs(int[][] picture, int x, int y, int m, int n, int ori, int visited) {
        if(x < 0 || x >= m || y < 0 || y >= n || picture[x][y] == 0 || picture[x][y] != ori) {
            return 0;
        }

        // 방문했으면 -0로 전환
        picture[x][y] = 0;
        visited++;
        for(int[] dir : dirs) {
            visited += dfs(picture, x + dir[0], y + dir[1], m, n, ori, 0);
        }
        return visited;
    }

    public static void copy(int[][] picture, int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (n >= 0) System.arraycopy(picture[i], 0, arr[i], 0, n);
        }
    }
}
