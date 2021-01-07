package Graph.WordSearch;

/**
 * 주어진 문자그리드에서 주어진 문자열을 찾는 문제
 * 깊고 파고드는문제 -> DFS
 */
public class WordSearch {

    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int m, n;
    public static boolean solve(char[][] grid, String word) {
        // 1.
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }
        m = grid.length;
        n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(dfs(grid, visited, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * dfs는 깊게 들어가다가 조건에 안맞으면 팅겨 나옴
     */
    private static boolean dfs(char[][] grid, boolean[][] visited, int x, int y, int start, String word) {
        // 결과에 도달했을 경우 good
        if(start == word.length()) {
            return true;
        }
        // 그리드 범위 벗어난 것 out
        if(x < 0 || x >= m || y < 0 || y >= n) {
            return false;
        }
        // 이미 방문했다. out
        if(visited[x][y]) {
            return false;
        }
        // 그리드의 값과 찾고자하는 단어가 틀릴 경우 out
        if(grid[x][y] != word.charAt(start)) {
            return false;
        }

        visited[x][y] = true;
        for(int[] dir: dirs) {
            int dx = x+dir[0];
            int dy = y+dir[1];
            if(dfs(grid, visited, dx, dy, start+1, word)) {
                return true;
            }
        }
        // 사방을 돌았는데도 연결점이 없다면 현재 방문포인트값을 false로 돌려줌
        visited[x][y] = false;
        return false;
    }
}
