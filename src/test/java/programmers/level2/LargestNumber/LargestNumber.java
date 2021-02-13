package programmers.level2.LargestNumber;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  프로그래머스 lv2
 *  가장 큰 수
 *  1. 배열의 값을 string으로 변환 후
 *  2. 비교하고자 하는 값이랑 더해서 숫자형으로 파싱하고 비교해서 정렬
 *  3. 정렬된 것을 합침
 *  - 0으로만 들어온 경우가 있음.(return시 삼항)
 */
public class LargestNumber {
    public String solution(int[] numbers) {

        String result = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) ->
                        Integer.parseInt(b + a) - Integer.parseInt(a + b))
                .collect(Collectors.joining());

        return (result.indexOf("0") == 0) ? "0":result;
    }
}
