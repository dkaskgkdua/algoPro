package Graph.NumberOfIsland;

/**
 * DFS 문제 - 육지가 몇개인가?
 * 2차원 배열을 2중 for 문으로 돌린다.
 * 값이 '1'인 것을 체크해서 카운트한다.
 * 동시에 재귀를 통해서
 * 사방(위,아래,왼,오) 탐색해서 '1'인 것을 다른 값으로 변경
 * 그럼 같은 육지에 있는 것은 다른 값으로 바뀌면서 카운트가 안됨.
 */
public class NumberOfIsland {
    public static int solve(char[][] grid) {
        print(grid);
        // 1. error 처리
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        // 2. 00 위치가 1인 것부터 찾는다.
        int count = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
            System.out.println();
        }

        return count;
    }
    public static void dfs(char[][] grid, int i, int j) {
        int m =grid.length;
        int n = grid[0].length;
        if(i < 0 || i >= m || j < 0 || j >=n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'X';

        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);

    }

    public static void print(char[][] grid) {
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                System.out.print(" grid["+i+"]["+j+"] " + grid[i][j]);
            }
            System.out.println();
        }
    }
}
