package Graph.NumberOfIsland;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {
    public static int solve(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    static int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0,-1}};

    public static void bfs(char[][] grid, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
                // 기준 좌표값의 상하좌우
            for(int[] dir: dirs) {
                int x1 = point[0]+dir[0];
                int y1 = point[1]+dir[1];
                // 유효범위 내에서 값이 1이면 0으로 바꾼 후 queue에 넣어 다시 상하좌우 돌려서 0으로 바꿈
                if(x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length
                    && grid[x1][y1] == '1') {
                    grid[x1][y1] ='0';
                    queue.offer(new int[] {x1, y1});
                }
            }
        }
    }
}
