package Graph.Mazel;

public class Mazel_DFS {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;

    public static  boolean hasPath(int[][] maze, int[] start, int[] dest) {
        if(maze== null || maze.length == 0) {
            return false;
        }

        m = maze.length;
        n = maze[0].length;

        boolean[][] visited = new boolean[m][n];


        return dfs(maze, start, dest, visited);
    }

    public static boolean dfs(int[][] maze, int[] start, int[] dest, boolean[][] visited) {
        // 영역 외 or 방문했던 곳이면 false
        if(start[0] < 0 || start[0] >= m || start[1] <0 || start[1] >= n || visited[start[0]][start[1]]) {
            return false;
        }
        // 방문했을 경우
        visited[start[0]][start[1]] = true;
        // 목적지와 값이 같다면
        if(start[0] == dest[0] && start[1] == dest[1]) {
            return true;
        }

        // 2 사방으로 탐색
        for(int[] dir: dirs) {
            int x = start[0];
            int y = start[1];
            // 사방으로 탐색한 좌표가 벽, 유효범위 밖이 아닐 경우 탐색(벽구간 없으면 쭉 내려감)
            while( x >= 0 && x < m && y >= 0 && y < n && maze[x][y] != 1) {
                x += dir[0];
                y += dir[1];
            }
            // 한계점보다 한칸 더 갔으니 한칸 다시 댕김(벽에 팅긴다는 개념)
            x -= dir[0];
            y -= dir[1];
            // 거기서부터 다시 dfs 탐색
            if(dfs(maze, new int[] {x, y}, dest, visited)) {
                return true;
            }
        }
        return false;
    }
}
