package programmers.level2.NumberOf124Countries;

public class NumberOf124Countries {
    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        /**
         *  원래는 3진법 기준으로 0, 1, 2 이지만 여긴 0이 없어서 4로 함
         */
        int[] rule = {4, 1, 2};

        while(n > 0) {
            int re = n % 3;
            n /= 3;

            // 0이 없으니 4를 기준으로 해야함
            if(re == 0) n--;

            answer.insert(0, rule[re]);
        }

        return answer.toString();
    }
}
