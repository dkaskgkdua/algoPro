package programmers.level1.없는숫자더하기;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] counts = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int number : numbers) {
            counts[number]++;
        }
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] == 0) answer += i;
        }
        return answer;
    }

}
