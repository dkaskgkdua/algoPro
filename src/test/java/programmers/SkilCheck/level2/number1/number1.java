package programmers.SkilCheck.level2.number1;

public class number1 {
    public static int solution(int n) {
        int ans = 0;
        while(n != 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}
