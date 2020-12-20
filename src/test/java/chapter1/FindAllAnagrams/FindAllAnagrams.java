package chapter1.FindAllAnagrams;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static List<Integer> findAnagrams(String txt, String pat) {
        List<Integer> result = new ArrayList<>();
        // 1. 빈값 체크
        if(txt == null || txt.length() == 0 || pat == null || pat.length() == 0
                || txt.length() < pat.length()) {
            return result;
        }
        // 2. 아스키코드 세팅
        int[] patArr = new int[256];  // [0, 0, 0, 0, 1, 1, 1, 1, 0 0000]
        for(int i = 0; i < pat.length(); i++) {
            patArr[pat.charAt(i)]++;
        }
        // 패턴보다 짧은 길이의 문자는 비교할 필요가 없음
        for(int i = 0; i < txt.length()-pat.length()+1; i++) {
            int[] txtArr = new int[256];
            // txt의 문자 인덱스를 기준으로 4개를 하는 것이므로 i+j
            for(int j = 0; j <pat.length(); j++){
                txtArr[txt.charAt(i+j)]++;
            }
            // 비교해서 같으면 result에 txt의 index를 담음
            if(check(patArr, txtArr)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean check(int[] patArr, int[] txtArr) {
        for(int i = 0; i < patArr.length; i++) {
            if(patArr[i] != txtArr[i]) {
                return false;
            }
        }
        return true;
    }
}
