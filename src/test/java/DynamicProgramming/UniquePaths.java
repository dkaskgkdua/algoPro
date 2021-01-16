package DynamicProgramming;

/**
 * 시작(0,0)에서 끝(m,n)까지 가는 방법의 갯수
 * 1   1   1          규칙은 대상값의 왼쪽 셀과 위쪽 셀의 값을 더한것임.
 * 1   2   3
 * 1   3   6
 * 1   4  10
 */
public class UniquePaths {
    public static int uniquePaths(int m , int n) {
        Integer[][] map = new Integer[m][n];

        for(int i = 0; i < m; i++) {
            map[i][0] = 1;
        }

        for(int i = 0; i < n; i++) {
            map[0][i] = 1;
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }

        return map[m-1][n-1];
    }
}
