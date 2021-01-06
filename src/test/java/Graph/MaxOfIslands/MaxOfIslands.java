package Graph.MaxOfIslands;

/**
 * 가장 넓은 육지를 가지고 있는 육지의 갯수
 */
public class MaxOfIslands {

    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;
    public static int maxAreaOfIsland(int[][] grid) {
         // 1
        if(grid == null || grid.length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;

        int max = 0;
        // 2중 for문 돌리고 각 육지별 최대 갯수를 dfs로 가져온다.
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = dfs(grid, i, j, 0);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public static int dfs(int[][] grid, int x, int y, int area) {
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return area;
        }
        // 육지인 경우 ++
        grid[x][y] = 0;
        area++;
        // 사방으로 탐색
        for(int[] dir : dirs) {
            area = dfs(grid, x+dir[0], y+dir[1], area);
        }
        return area;
    }
}
