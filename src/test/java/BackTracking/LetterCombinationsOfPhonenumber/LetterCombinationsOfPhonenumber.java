package BackTracking.LetterCombinationsOfPhonenumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 주어진 input의 각 숫자에 해당하는 것을 인덱스로 삼아
 * letter에 뽑아 조합되는 경우의 수
 * input = "23"
 * 해당하는 letter = "abc", "def"
 * ad, ae, af, bd, be, bf, cd, ce, cf
 */
public class LetterCombinationsOfPhonenumber {
    public static List<String> solve(String digits, String[] digitletter) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0) {
            return result;
        }
        // 맨처음 기준점이 될 빈값 하나 넣어줌
        // 어차피 combine의 결과값으로 새로운 개체를 넣어줘서 상관없음
        result.add("");
        for(int i = 0; i < digits.length(); i++) {
            result = combine(result, digitletter[digits.charAt(i) - '0']);
        }
        System.out.println(result);
        return result;
    }

    private static List<String> combine(List<String> firstList, String digit) {
        List<String> result = new ArrayList<>();
        // list에 있는 것을 digit의 각 char 마다 더해줘서 결과값에 담음
        for(int i = 0; i < digit.length(); i++) {
            for(String firstStr : firstList) {
                result.add(firstStr+digit.charAt(i));
            }
        }
        return result;
    }
}
