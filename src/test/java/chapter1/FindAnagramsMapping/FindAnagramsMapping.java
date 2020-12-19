package chapter1.FindAnagramsMapping;

import java.util.HashMap;
import java.util.Map;

// A배열과 B배열의 값들이 서로 매칭되는 인덱스 배열을 반환
public class FindAnagramsMapping {
    public static int[] solve(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        int[] result = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]);
        }

        return result;
    }
}
