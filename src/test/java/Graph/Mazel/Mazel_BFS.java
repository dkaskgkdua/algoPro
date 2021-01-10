package Graph.Mazel;

import java.util.LinkedList;
import java.util.Queue;

public class Mazel_BFS {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;

    public static boolean hasPath(int[][] maze, int[] start, int[] dest) {
        m = maze.length;
        n = maze[0].length;
        if(start[0] == dest[0] && start[1] == dest[1]) {
            return true;
        }
        boolean[][] visited = new boolean[m][n];
        visited[start[0]][start[1]] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {start[0], start[1]});

        while(!queue.isEmpty()) {
            int[] p = queue.poll();
            // 사방으로
            for(int[] dir: dirs) {
                int x = p[0] + dir[0];
                int y = p[1] + dir[1];
                // 유효 그리드 내 범위이고 통과값인 0인 경우 다음 1을 만날때까지 쭉 통과
                // 만약 이 통과되는 지점이 목표지점이면 최종 결과값은 false가 나와야함(못멈춤)
                while(x >= 0 && x < m && y >= 0 && y < n && maze[x][y] == 0) {
                    x+=dir[0];
                    y+=dir[1];
                }
                // 1(벽)을 만났거나 유효범위가 아니면 다시 전으로
                x-=dir[0];
                y-=dir[1];
                // 방문 했던 곳이면 패스
                if(visited[x][y]) {
                    continue;
                }
                //  방문 체크
                visited[x][y] = true;
                // 목적지와 현재 x, y값이 일치할 경우
                if(x == dest[0] && y == dest[1]) {
                    return true;
                }
                // 벽에 막힌 부분에서 다시 queue에 넣어 상하좌우 돌림
                queue.offer(new int[] {x, y});
            }
        }

        return false;
    }
}
