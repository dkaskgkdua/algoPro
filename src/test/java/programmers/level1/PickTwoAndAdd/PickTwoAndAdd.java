package programmers.level1.PickTwoAndAdd;

import java.util.Set;
import java.util.TreeSet;

public class PickTwoAndAdd {
    public static int[] solution(int[] numbers) {
        Set<Integer> answerSet = new TreeSet<>();
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                answerSet.add(numbers[i]+numbers[j]);
            }
        }

        return answerSet.stream().mapToInt(i -> i).toArray();
    }
}
