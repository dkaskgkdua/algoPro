package programmers.level2.HIndex;

import java.util.Arrays;
import java.util.Comparator;

public class Hindex {
    public int solution(int[] citations) {
        int h = 0;

        Integer[] arr = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i = 0; i < arr.length; i++) {
            h++;
            if(h > arr[i]) {
                break;
            }
            if(i == arr.length-1) {
               h++;
            }
        }


        return --h;
    }
}
