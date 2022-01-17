package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class newIdRecom {
        public String solution(String new_id) {
            char[] chars = new_id.toCharArray();

            for(int i = 0; i < chars.length; i++) {
                int ascC = chars[i];
                // 1단계
                if(65 <= ascC && ascC <= 90) {
                    chars[i] = (char)(ascC + 32);
                }
            }
            for(int i = 0; i < chars.length; i++) {
                int ascC = chars[i];
                // 2단계
                if (!check(ascC)) {
                    chars[i] = ' ';
                }
            }
            for(int i = 0; i < chars.length; i++) {
                int ascC = chars[i];
                // 3단계
                if(ascC == 46) {
                    thirdCheck(chars, i, chars.length, i);
                }

                if (i != 0 && ascC == 46 && (int) chars[i - 1] == 46) {
                    chars[i - 1] = ' ';
                }
            }
            // 4단계 앞자리
            for(int i = 0; i < chars.length; i++) {
                int ascC = chars[i];

                if(ascC != ' ' && ascC != 46) {
                    break;
                } else if(ascC == 46) {
                    chars[i] = ' ';
                }
            }
            // 4단계 뒷자리
            for(int i = chars.length-1; i >= 0; i--) {
                int ascC = chars[i];
                // 4단계
                if(ascC != ' ' && ascC != 46) {
                    break;
                } else if(ascC == 46) {
                    chars[i] = ' ';
                }
            }
            //6단계
            List<Character> tempList = new ArrayList<Character>();
            for (char aChar : chars) {
                if (aChar != ' ') {
                    tempList.add(aChar);
                }
            }
            if(tempList.size() >= 16) {
                tempList.subList(15, tempList.size()).clear();
            }

            for(;;) {
                if(tempList.size() > 0 && (int)tempList.get(tempList.size() - 1) == 46 ) {
                    tempList.remove(tempList.size() - 1);
                } else {
                    break;
                }
            }
            // 5단계
            if(tempList.size() == 0) {
                tempList.add('a');
            }

            // 7단계
            for(;;) {
                if(tempList.size() <= 2) {
                    tempList.add(tempList.get(tempList.size() - 1));
                }else {
                    break;
                }
            }

            // 문자열 바꿔서 반환
            StringBuilder answer = new StringBuilder();
            for(int i = 0; i < tempList.size(); i ++) {
                answer.append(tempList.get(i).toString());
            }

            return answer.toString();
        }

        // 3단계 재귀 이용해서 체크
        public void thirdCheck(char[] chars, int i, int length, int startIndex) {
            if(i == length-1) return;

            if(chars[i + 1] == 46) {
                chars[i + 1] = ' ';
                // 뒤에 . 케이스 추가 체크
                thirdCheck(chars, startIndex, length, startIndex);
            }
            else if(chars[i + 1] == ' ') {
                thirdCheck(chars, i+1, length, startIndex);
            }
        }

        // 아스키코드로 구분해서 체크
        public boolean check(int c) {
            if(97 <= c && c <= 122) return true;
            if(48 <= c && c <= 57 ) return true;
            if(c == 45 || c == 95 || c == 46) return true;
            return false;
        }
}
